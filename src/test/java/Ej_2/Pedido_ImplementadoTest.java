package Ej_2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class Pedido_ImplementadoTest {

    private Pedido_Implementado pedido;
    private Cliente_Implementado cliente;


    @Test
    public void testGetCliente() {
        assertEquals(cliente, pedido.getCliente());
    }


    @Test
    public void testGetPrecioTotal() {
        assertEquals(22.0, pedido.getPrecioTotal(), 0.01);
    }

    @Test
    public void testCalcularPrecioTotal() {
        assertEquals(22.0, pedido.getPrecioTotal(), 0.01);
    }
}
