package Ej_2;

import java.util.List;

public class Cliente_Implementado {

    // Atributos info. del cliente
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor de la clase
    public Cliente_Implementado(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método para obtener el nombre del cliente

    public String getNombre() {
        return this.nombre;
    }

    // Método para establecer el nombre del cliente

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la dirección del cliente

    public String getDireccion() {
        return this.direccion;
    }

    // Método para establecer la dirección del cliente

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para obtener el teléfono del cliente

    public String getTelefono() {
        return this.telefono;
    }

    // Método para establecer el teléfono del cliente

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para obtener el historial de pedidos del cliente

    private List<Pedido> historialPedidos;

    public List<Pedido> getHistorialPedidos() {
        return this.historialPedidos;
    }

    // Método para agregar un pedido al historial de pedidos del cliente

    public void agregarPedido(Pedido pedido) {
        this.historialPedidos.add(pedido);
    }


    public boolean verificarCredenciales(String nombreUsuario, String contrasena) {
        // Lógica para verificar las credenciales del usuario
        // Devuelve true si las credenciales son válidas, false en caso contrario
        return false; // Por ahora retornamos false como ejemplo
    }
}