package Ej_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=============================================================================");
            System.out.println("¿Qué desea hacer?");
            System.out.println("=============================================================================");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    registrarNuevoUsuario(scanner);
                    break;
                case "2":
                    iniciarSesion(scanner);
                    break;
                case "3":
                    salir = true;
                    System.out.println("=============================================================================");
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }

    private static void registrarNuevoUsuario(Scanner scanner) {
        System.out.println("=============================================================================");
        System.out.println("Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Por favor, ingrese su dirección:");
        String direccion = scanner.nextLine();
        System.out.println("Por favor, ingrese su número de teléfono:");
        String telefono = scanner.nextLine();


        // Crear un cliente con los datos proporcionados
        Cliente_Implementado cliente = new Cliente_Implementado(nombre, direccion, telefono);

        // Crear un pedido asociado al cliente
        Pedido_Implementado pedido = new Pedido_Implementado(cliente);


        // Guardar el pedido en la base de datos

        System.out.println("=============================================================================");
        System.out.println("Usuario registrado exitosamente.");
    }

    private static void iniciarSesion(Scanner scanner) {
        System.out.println("=============================================================================");
        System.out.println("Por favor, ingrese su nombre de usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Por favor, ingrese su dirección:");
        String direccion = scanner.nextLine();
        System.out.println("Por favor, ingrese su número de teléfono:");
        String telefono = scanner.nextLine();

        // Autenticar al usuario
        Cliente_Implementado cliente = new Cliente_Implementado(nombre,direccion,telefono);
        Authenticator_Implementado authenticator = new Authenticator_Implementado(cliente);



        if (cliente != null) {
            System.out.println("=============================================================================");
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + cliente.getNombre() + "!");
            // Menú principal después de iniciar sesión
            boolean salir = false;
            OrderManager_Implementado orderManager = new OrderManager_Implementado(new DataBaseManager_Implementado(), new Authenticator_Implementado(cliente));
            Menu_Implementado menu = new Menu_Implementado();
            while (!salir) {
                System.out.println("=============================================================================");
                System.out.println("¿Qué desea hacer?");
                System.out.println("=============================================================================");
                System.out.println("1. Hacer un nuevo pedido");
                System.out.println("2. Ver pedidos existentes");
                System.out.println("3. Borrar un pedido existente");
                System.out.println("4. Cerrar sesión");
                String opcion = scanner.nextLine();

                try {
                    switch (opcion) {

                        case "1":
                            realizarPedido(cliente, orderManager, menu, scanner);
                            break;
                        case "2":
                            verPedidos(cliente, orderManager);
                            break;
                        case "3":
                            borrarPedidos(orderManager);
                            break;
                        case "4":
                            salir = true;
                            break;
                        default:
                            System.out.println("=============================================================================");
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("=============================================================================");
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            }
        }else {
            System.out.println("Nombre de usuario o número de teléfono incorrecto. Por favor, inténtelo de nuevo.");
        }
    }

    // Métodos para realizar un pedido
    private static void realizarPedido(Cliente_Implementado cliente, OrderManager_Implementado orderManager, Menu_Implementado menu, Scanner scanner) {
        // Crear un pedido asociado al cliente
        Pedido_Implementado pedido = new Pedido_Implementado(cliente);

        // Mostrar el menú y permitir al usuario seleccionar pizzas
        System.out.println("=============================================================================");
        System.out.println("Bienvenido al restaurante. Este es nuestro menú:");
        System.out.println("=============================================================================");
        boolean continuarSeleccionando = true;
        while (continuarSeleccionando) {
            List<String> pizzasDisponibles = menu.obtenerPizzasDisponibles();
            for (int i = 0; i < pizzasDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + pizzasDisponibles.get(i) + " - Precio: " + menu.getPrecioPizza(pizzasDisponibles.get(i)));
            }
            System.out.println("Seleccione las pizzas que desea (ingrese el número de la pizza):");
            List<Pizza> pizzasSeleccionadas = new ArrayList<>();

            int opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= pizzasDisponibles.size()) {
                Pizza pizzaSeleccionada = new Pizza_Implementado(pizzasDisponibles.get(opcion - 1), menu.getPrecioPizza(pizzasDisponibles.get(opcion - 1)));
                pizzasSeleccionadas.add(pizzaSeleccionada);
                System.out.println("=============================================================================");
                System.out.println("Pizza seleccionada: " + pizzaSeleccionada.getNombre());
                scanner.nextLine(); // Limpiar el buffer del scanner

                System.out.println("=============================================================================");
                System.out.println("¿Desea agregar otra pizza? (S/N)");
                System.out.println("=============================================================================");
                String respuesta = scanner.nextLine().trim();  // Lee la respuesta y elimina los espacios en blanco alrededor
                if (!respuesta.equalsIgnoreCase("S")) {
                    continuarSeleccionando = false;
                }
            } else {
                System.out.println("=============================================================================");
                System.out.println("Opción inválida. Por favor, ingrese un número de pizza válido.");
                System.out.println("=============================================================================");
            }

            // Agregar las pizzas seleccionadas al pedido
            for (Pizza pizza : pizzasSeleccionadas) {
                pedido.agregarPizza(pizza);
            }
        }

        // Calcular el precio total del pedido
        pedido.calcularPrecioTotal();

        // Crear el pedido en el sistema
        orderManager.createOrder(pedido);
    }

    public static void verPedidos(Cliente_Implementado cliente, OrderManager_Implementado orderManager) {
        System.out.println("=============================================================================");
        System.out.println("Lista de todos los pedidos:");
        System.out.println("=============================================================================");
        orderManager.checkOrder();
    }

    public static void borrarPedidos(OrderManager_Implementado orderManager) {
        orderManager.deleteOrder(); // Llama directamente al método deleteOrder para eliminar todos los pedidos
    }
}