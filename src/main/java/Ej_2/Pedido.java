package Ej_2;

import java.util.List;

public interface Pedido {
    // Métodos para obtener y manejar la lista de pizzas seleccionadas en el pedido
    List<Pizza> getPizzas(); // Retorna la lista de pizzas seleccionadas
    void agregarPizza(Pizza pizza); // Agrega una pizza a la lista de pizzas seleccionadas

    // Métodos para obtener y calcular el precio total del pedido
    double getPrecioTotal(); // Retorna el precio total del pedido
    void calcularPrecioTotal(); // Calcula y actualiza el precio total del pedido
}
