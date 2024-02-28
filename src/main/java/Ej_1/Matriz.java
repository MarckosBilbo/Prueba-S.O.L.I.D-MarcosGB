package Ej_1;

import java.util.Scanner;

public class Matriz implements MatrizInterface {
    private int[][] datos;

    // Constructor que inicializa la matriz con valores metidos manualmente por el usuario
    public Matriz() {
        datos = new int[2][2];
    }
    public Matriz(int[][] datos) {
        this.datos = datos;
    }

    // Con este método el ususario puede meter los valores a la matriz
    public void recogerValores(int[][] valores) throws MatrizException {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                validarPosicion(i, j); // Validamos la posición antes de asignar el valor
                datos[i][j] = valores[i][j];
            }
        }
    }


    // (Creado para implementaciones distintas) con este en caso de que selecionasemos en que  posicion meter cada valor comprobaria que elegimos bien la posicion y no nos salimos de la matriz
    private void validarPosicion(int fila, int columna) throws MatrizException {
        if (!(fila >= 0 && fila < datos.length && columna >= 0 && columna < datos[0].length)) {
            throw new MatrizException("La posición especificada está fuera del rango de la matriz");
        }
    }

    // Implementación del método imprimir de la interfaz
    @Override
    public void imprimir() {
        for (int[] fila : datos) {
            for (int elemento : fila) {
                System.out.print("[" + elemento + "]");
            }
            System.out.println();
        }
    }

    // Implementación del método transpuesta de la interfaz
    @Override
    public Matriz transpuesta() {
        int filas = datos.length;
        int columnas = datos[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = datos[i][j];
            }
        }
        return new Matriz(transpuesta);
    }
}