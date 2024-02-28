package Ej_2;

import java.util.ArrayList;
import java.util.List;

public class DataBaseManager_Implementado {
    private boolean estaConectado; // Variable para verificar si está conectado a la base de datos
    private List<Pedido_Implementado> pedidos; // Lista para almacenar los pedidos

    // Constructor
    public DataBaseManager_Implementado() {
        this.estaConectado = false; // Inicialmente no está conectado
        this.pedidos = new ArrayList<>(); // Inicialización de la lista de pedidos
    }

    // Método para conectar a la base de datos
    public void conectar() {
        if (!estaConectado) {
            // Lógica para establecer la conexión con la base de datos
            System.out.println("Conectando a la base de datos...");
            System.out.println("*****************************************************************************");
            estaConectado = true; // Actualiza el estado de conexión
        } else {
            System.out.println("Ya está conectado a la base de datos.");
        }
    }

    // Método para desconectar de la base de datos
    public void desconectar() {
        if (estaConectado) {
            // Lógica para cerrar la conexión con la base de datos
            System.out.println("=============================================================================");
            System.out.println("Desconectando de la base de datos...");
            estaConectado = false; // Actualiza el estado de conexión
        } else {
            System.out.println("Ya está desconectado de la base de datos.");
        }
    }

    // Método para verificar si está conectado a la base de datos
    public boolean estaConectado() {
        return estaConectado;
    }

    // Método para insertar un pedido en la base de datos
    public void insertarPedido(Pedido_Implementado pedido) {
        if (estaConectado) {
            pedidos.add(pedido); // Agrega el pedido a la lista de pedidos
            System.out.println("Pedido insertado en la base de datos.");
        } else {
            System.out.println("Error: No se puede insertar el pedido, no está conectado a la base de datos.");
        }
    }

    // Método para mostrar todos los pedidos registrados
    public void checarPedido() {
        // Verificar si hay pedidos
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        } else {
            // Mostrar todos los pedidos
            System.out.println("Pedidos registrados:");
            for (Pedido_Implementado pedido : pedidos) {
                System.out.println("*****************************************************************************");
                System.out.println("Cliente: " + pedido.getCliente().getNombre());
                System.out.println("=============================================================================");
                System.out.println("Detalles del pedido:");
                System.out.println("*****************************************************************************");
                for (Pizza pizza : pedido.getPizzas()) {
                    System.out.println("- Pizza: " + pizza.getNombre() + " - Precio: " + pizza.getPrecio());
                }
                System.out.println("=============================================================================");
                System.out.println("Precio total del pedido: " + pedido.getPrecioTotal());
            }
        }
    }

    // Método para recibir todos los pedidos
    public List<Pedido_Implementado> recivirTodo() {
        List<Pedido_Implementado> allOrders = pedidos; // Obtiene todos los pedidos
        return allOrders;
    }

    // Método para eliminar todos los pedidos de la base de datos
    public void eliminarPedido() {
        if (estaConectado()) {
            pedidos.clear(); // Elimina todos los pedidos
            System.out.println("Todos los pedidos han sido eliminados de la base de datos.");
        } else {
            System.out.println("Error: No se puede eliminar los pedidos, no está conectado a la base de datos.");
        }
    }

    // Método para obtener todos los pedidos de la base de datos
    public List<Pedido_Implementado> obtenerPedidos() {
        if (estaConectado) {
            return new ArrayList<>(pedidos); // Devuelve una copia de la lista de pedidos
        } else {
            System.out.println("Error: No se pueden obtener los pedidos, no está conectado a la base de datos.");
            return new ArrayList<>(); // Devuelve una lista vacía
        }
    }
}