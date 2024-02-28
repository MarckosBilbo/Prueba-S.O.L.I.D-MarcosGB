package Ej_1;

import org.junit.Test;

public class MatrizTest {

    @Test
    public void testImprimir() {
        // Arrange
        Matriz matriz = new Matriz(new int[][]{{1, 2}, {3, 4}});

        // Act (no es necesario para este método)

        // Assert (No hay nada que asertar en este caso, ya que no hay salida esperada)
        // Simplemente ejecutamos el método imprimir y no se espera ninguna excepción
        matriz.imprimir();
    }

    @Test
    public void testTraspuesta() {
        // Arrange
        Matriz matriz = new Matriz(new int[][]{{1, 2}, {3, 4}});

        // Act (no es necesario para este método)

        // Assert (No hay nada que asertar en este caso, ya que no hay salida esperada)
        // Simplemente ejecutamos el método imprimir y no se espera ninguna excepción
        matriz.transpuesta();
    }
}
