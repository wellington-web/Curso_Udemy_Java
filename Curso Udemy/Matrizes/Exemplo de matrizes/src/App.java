/*************************************************************************************************************
 * 1 - Fazer um programa para ler um número inteiro (N) e uma matriz de ordem (N) contendo números inteiros.
 * 2 - Mostrar a diagonal principal.
 * 3 - Mostrar valores negativos da matriz.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers");

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat [i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat [i] [j] < 0)
                    count++;
            }
        }
    //  for (int[] ints : mat) {
    //      for (int j = 0; j < n; j++) {
    //          if (ints[j] < 0)
    //              count++;
    //      }
    //  }

        System.out.println("Negative Numbers: " + count);

        sc.close();
    }
}