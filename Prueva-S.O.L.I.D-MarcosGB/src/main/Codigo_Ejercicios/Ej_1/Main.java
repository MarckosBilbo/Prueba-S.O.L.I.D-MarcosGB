package Ej_1;

public class Main {
    public static void main(String[] args) {

        // Lo primero creamos una matriz de ejemplo
        String[][] datos = {{"[1]", "[2]"}, {"[3]", "[4]"}};

        // Crear una matriz utilizando el método estático de la interfaz
        MatrizInterface miMatriz = new Matriz(datos);

        // Imprimir la matriz original
        System.out.println("==================================");
        System.out.println("Esta es la matriz original:");
        System.out.println("**********************************");
        miMatriz.imprimir();

        // Calcular la transpuesta
        MatrizInterface matrizTranspuesta = miMatriz.transpuesta();

        // Imprimir la matriz transpuesta
        System.out.println("==================================");
        System.out.println("La volteamos y queda así:");
        System.out.println("**********************************");
        matrizTranspuesta.imprimir();
        System.out.println("**********************************");
    }
}
