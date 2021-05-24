/*************************************************************************************************************
 * 1 - Fazer um programa para ler quatro valores inteiros A, B, C e D.
 * 2 - Calcule e mostre a diferença do produto de A e B pelo produto de C e D
 * 3 - Fórmula: DIFERENCA = (A * B - C * D).
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, difference;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        difference = (A * B - C * D);

        System.out.println("Difference: " + difference);

        sc.close();
    }
}