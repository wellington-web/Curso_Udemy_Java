/*************************************************************************************************************
 * 1 - Fazer um programa ler dois números inteiros (M e N).
 * 2 - Ler uma matriz de M linhas por N colunas contendo números inteiros.
 * 3 - podendo haver restriçôes.
 * 4 - Ler um número inteiro X que pertence à matriz.
 * 5 - Para cada ocorrência de X, mostrar os valores à (esqueda, acima,à direita e abaixo de X).
 * 6 - Quando houver.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int m = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers");

        int [] [] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat [i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter with number you want get: ");
        int x = sc.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}