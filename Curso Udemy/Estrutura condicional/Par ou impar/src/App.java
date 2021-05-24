/*************************************************************************************************************
 * 1 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter the number: ");

        number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("It's even number");
        }
        else {
            System.out.println("It's odd number");
        }

        sc.close();

    }
}