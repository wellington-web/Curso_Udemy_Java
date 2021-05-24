/*************************************************************************************************************
 * 1 - Leia 2 valores inteiros (A e B).
 * 2 - Mostrar "Sao Multiplos" ou "Nao sao Multiplos".
 * 3 - Indicando se os valores lidos são múltiplos entre si.
 * 4 - Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A,B;

        System.out.println("Enter with the numbers: ");

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Are multiple");
        }
        else {
            System.out.println("Are not multiple");
        }

        sc.close();
    }
}