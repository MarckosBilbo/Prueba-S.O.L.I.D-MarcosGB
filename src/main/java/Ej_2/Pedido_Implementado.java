package Ej_2;

import java.util.List;
import java.util.ArrayList;

public class Pedido_Implementado implements Pedido {
    // Atributos
    private List<Pizza> pizzas; // Lista de pizzas seleccionadas para este pedido
    private double precioTotal; // Precio total del pedido
    private Cliente_Implementado cliente; // Cliente asociado al pedido

    // Constructor
    public Pedido_Implementado(Cliente_Implementado cliente) {
        this.cliente = cliente;
        this.pizzas = new ArrayList<>(); // Inicializa la lista de pizzas vacía
        this.precioTotal = 0.0; // Inicializa el precio total en 0
    }

    // Métodos de la interfaz Pedido

    // Método para obtener el cliente asociado al pedido
    public Cliente_Implementado getCliente() {
        return cliente;
    }
    @Override
    public List<Pizza> getPizzas() {
        return pizzas; // Retorna la lista de pizzas seleccionadas
    }

    @Override
    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza); // Agrega una pizza a la lista de pizzas seleccionadas
    }

    @Override
    public double getPrecioTotal() {
        return precioTotal; // Retorna el precio total del pedido
    }

    @Override
    public void calcularPrecioTotal() {
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPrecio(); // Suma el precio de cada pizza a total
        }
        this.precioTotal = total; // Actualiza el precio total del pedido
    }
}
