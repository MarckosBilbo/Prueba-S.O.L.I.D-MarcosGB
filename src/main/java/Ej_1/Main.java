package Ej_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz();

        int[][] valores = new int[2][2];

        System.out.println("=======================");
        try {

            //pasamos pididendo valores para cada posicion de la matriz
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Mete valor en [" + (i) + "][" + (j) + "]: ");
                    valores[i][j] = scanner.nextInt();
                }
            }


            System.out.println("=======================");
            //Cogemos los valores metidos y los metemos en la instancia matriz
            matriz.recogerValores(valores);
            System.out.println("Matriz original:");
            System.out.println("***********************");
            //Les enseñamos en pantalla la matiz con los datos recogidos
            matriz.imprimir();


            System.out.println("=======================");
            System.out.println("Matriz transpuesta:");
            System.out.println("***********************");
            //Aqui hace el calculo de la trasposicion y encima lo imprime de misma manera
            matriz.transpuesta().imprimir();
            System.out.println("=======================");

        //Si hay caulquier error en la matriz con lo de elegir posiciones (No es el caso, pero por si acaso)
        } catch (MatrizException e) {
            System.out.println("Error al ingresar valores: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}