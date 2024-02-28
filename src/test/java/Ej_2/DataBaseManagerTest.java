package Ej_2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DataBaseManagerTest {

    @Test
    public void testObtenerPedidosCuandoNoConectado() {
        // Arrange
        DataBaseManager_Implementado dataBaseManager = new DataBaseManager_Implementado();

        // Act
        List<Pedido_Implementado> pedidos = dataBaseManager.obtenerPedidos();

        // Assert
        assertTrue(pedidos.isEmpty());
    }
}
