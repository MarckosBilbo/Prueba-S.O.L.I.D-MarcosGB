package Ej_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz;

        try {
            // Pedir al usuario que ingrese el tamaño de la matriz
            System.out.println("=================================================");
            System.out.print("Ingrese el número de filas de la matriz: ");
            int filas = scanner.nextInt();
            System.out.println("=================================================");
            System.out.print("Ingrese el número de columnas de la matriz: ");
            int columnas = scanner.nextInt();

            // Crear la matriz con el tamaño especificado por el usuario
            matriz = new Matriz(filas, columnas);

            int[][] valores = new int[filas][columnas];

            System.out.println("=======================");

            // Pedir al usuario que ingrese los valores de la matriz
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("Mete valor en [" + i + "][" + j + "]: ");
                    valores[i][j] = scanner.nextInt();
                }
            }

            System.out.println("=======================");

            // Asignar los valores ingresados a la matriz
            matriz.recogerValores(valores);

            // Mostrar la matriz original
            System.out.println("Matriz original:");
            System.out.println("***********************");
            matriz.imprimir();

            System.out.println("=======================");
            System.out.println("Matriz transpuesta:");
            System.out.println("***********************");
            // Mostrar la matriz transpuesta
            matriz.transpuesta().imprimir();
            System.out.println("=======================");

        } catch (MatrizException e) {
            System.out.println("Error al ingresar valores: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("*************************************************");
            System.out.println("Solo puedes meter números enteros");
            System.out.println("*************************************************");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("*************************************************");
            System.out.println("Establece un tamaño con sentido");
            System.out.println("*************************************************");
        } catch (NegativeArraySizeException e) {
            System.out.println("*************************************************");
            System.out.println("Establece un tamaño con sentido");
            System.out.println("*************************************************");
        } finally {
                scanner.close();
            }
        }
    }

