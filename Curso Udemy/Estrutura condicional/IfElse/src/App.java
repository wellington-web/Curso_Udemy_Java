/*************************************************************************************************************
 * 1 - Fazer um programa para ler um número inteiro
 * 2 - Depois dizer se este número é negativo ou não.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter with one number: ");

        number = sc.nextInt();

        if (number < 0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is not negative");
        }

        sc.close();
    }
}