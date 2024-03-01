package Ej_2;

import java.util.List;

public interface Menu {
    // Método para obtener la lista de pizzas disponibles en el menú
    List<String> obtenerPizzasDisponibles();

    // Método para obtener el precio de una pizza específica
    double getPrecioPizza(String nombrePizza);
}
