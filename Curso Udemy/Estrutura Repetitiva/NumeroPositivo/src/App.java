/*************************************************************************************************************
 * 1 - Fazer um programa para ler números inteiros positivos (N).
 * 2 - Mostrar (N) linhas.
 * 3 - Começando de 1 até (N).
 * 4 - Para cada linha mostrar (número da linha , o quadrado e o cubo do valor).
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            int first = i;

            int second = i * i;

            int third = i * i * i;

            System.out.printf("%d %d %d%n", first, second, third);
        }

        sc.close();
    }
}