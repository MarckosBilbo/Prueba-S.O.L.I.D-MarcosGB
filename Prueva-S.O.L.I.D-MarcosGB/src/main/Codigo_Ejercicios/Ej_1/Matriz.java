package Ej_1;

public class Matriz implements MatrizInterface {

    //Creamos como atributo la cascara de la matriz
    private String[][] matriz;
    //Creamos el constructor de la matriz
    public Matriz(String[][] matriz) {
        this.matriz = matriz;
    }


    //Implementemos el método que imprime la matriz en base a los datos que se le pasan (predecididdos)
    @Override
    public void imprimir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    //Implementemos el método que calcula- intercambia los datos de la matriz
    @Override
    public MatrizInterface transpuesta() {
        String[][] transpuesta = new String[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return new Matriz(transpuesta);
    }
}
