/*************************************************************************************************************
 * 1 - Fazer um programa para ler um valor inteiro X (1 <= X <= 1000).
 * 2 - Mostrar os ímpares de 1 até X.
 * 3 - Um valor por linha.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}