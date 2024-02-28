package Ej_2;

public class OrderManager_Implementado{

    // Atributos de otras clases
    private DataBaseManager_Implementado dataBaseManager;
    private Authenticator authenticator;

    // Constructor de la clase para tema de inyeccion
    public OrderManager_Implementado(DataBaseManager_Implementado dataBaseManager, Authenticator authenticator) {
        this.dataBaseManager = dataBaseManager;
        this.authenticator = authenticator;
    }

    public void createOrder(Pedido_Implementado pedido) {
        // Verificar la autenticación del usuario
        if (authenticator.authenticateUser(pedido.getCliente().getNombre(), pedido.getCliente().getTelefono())) {
            // Llamar al método de conexión de la base de datos
            dataBaseManager.conectar();

            // Insertar los datos del pedido en la base de datos
            dataBaseManager.insertarPedido(pedido);

            // Desconectar la base de datos
            dataBaseManager.desconectar();
        } else {
            System.out.println("Error: Usuario no autenticado.");
        }
    }

    public void checkOrder() {
        // Verificar la autenticación del usuario
            // Llamar al método de conexión de la base de datos
            dataBaseManager.conectar();

            // Actualizar los datos del pedido en la base de datos
            dataBaseManager.checarPedido();

            // Desconectar la base de datos
            dataBaseManager.desconectar();
    }

    public void deleteOrder() {

            // Llamar al método de conexión de la base de datos
            dataBaseManager.conectar();

            // Eliminar los datos del pedido de la base de datos
            dataBaseManager.eliminarPedido();

            // Desconectar la base de datos
            dataBaseManager.desconectar();

    }
}