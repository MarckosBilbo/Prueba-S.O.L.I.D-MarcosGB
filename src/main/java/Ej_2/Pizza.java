package Ej_2;


// Interfaz que define el contrato para una pizza en el sistema de gestión de pedidos de pizza en línea.
public interface Pizza {
    // Obtiene el nombre de la pizza.
    String getNombre();

    // Establece el nombre de la pizza.
    void setNombre(String nombre);

    // Obtiene el precio de la pizza.
    double getPrecio();

    // Establece el precio de la pizza.
    void setPrecio(double precio);
}
