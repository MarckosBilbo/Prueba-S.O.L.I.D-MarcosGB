package Ej_2;

// Clase que implementa la interfaz Pizza y representa una pizza en el sistema de gestión de pedidos de pizza en línea.
public class Pizza_Implementado implements Pizza {
    // Atributos de la pizza: nombre y precio
    private String nombre;
    private double precio;

    // Constructor para crear una pizza con un nombre y un precio específicos.
    public Pizza_Implementado(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos de la interfaz Pizza

    // Obtiene el nombre de la pizza.
    @Override
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre de la pizza.
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtiene el precio de la pizza.
    @Override
    public double getPrecio() {
        return precio;
    }

    // Establece el precio de la pizza.
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}