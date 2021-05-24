/*************************************************************************************************************
 * 1 - Fazer um programa para ler um valor (N).
 * 2 - Calcular e escrever seu respectivo fatorial.
 * 3 - Fatorial de ( N = N * (N-1) * (N-2) * (N-3) * ... * 1.).
 * 4 - Lembrando que, por definição, fatorial de 0 é 1.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int factorial = 1;

        for (int i=1; i<=n; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

        sc.close();
    }
}