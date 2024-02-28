package Ej_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu_Implementado implements Menu {
    // Mapa para almacenar el precio de cada pizza
    private Map<String, Double> precios;

    // Constructor que inicializa el mapa de precios
    public Menu_Implementado() {
        precios = new HashMap<>();
        inicializarPrecios();
    }

    // Método privado para inicializar los precios de las pizzas disponibles
    private void inicializarPrecios() {
        // Agregar pizzas disponibles con sus precios
        precios.put("Margarita", 8.99);
        precios.put("Pepperoni", 8.99);
        precios.put("Jamón y queso", 9.99);
        precios.put("Cuatro quesos", 9.99);
        precios.put("Hawaiana", 10.99);
        // Agregar más pizzas según sea necesario
    }

    @Override
    public List<String> obtenerPizzasDisponibles() {
        // Retornar la lista de nombres de las pizzas disponibles
        return List.copyOf(precios.keySet());
    }

    @Override
    public double getPrecioPizza(String nombrePizza) {
        // Obtener el precio de la pizza según su nombre
        return precios.getOrDefault(nombrePizza, 0.0);
    }
}