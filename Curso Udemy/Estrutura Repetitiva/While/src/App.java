/*************************************************************************************************************
 * 1 - É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int result= 0;

        System.out.println("Enter the number: ");

        number = sc.nextInt();

        while (number != 0) {
            result += number;
            number = sc.nextInt();
        }

        System.out.println(result);

        sc.close();
    }
}