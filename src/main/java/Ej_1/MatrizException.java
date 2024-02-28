package Ej_1;

// Aqui creamos una excepción personalizada para la clase Matriz (por lo de las posiciones si es que quisieramos implementarlas)
public class MatrizException extends Exception {
    public MatrizException(String mensaje) {
        super(mensaje);
    }
}
