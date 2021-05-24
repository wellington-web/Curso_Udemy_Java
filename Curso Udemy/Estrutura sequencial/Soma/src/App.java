/*************************************************************************************************************
 * 1 - Fazer um programa para ler dois valores inteiros.
 * 2 - Mostrar na tela a soma desses números com uma mensagem explicativa.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, Sum;

        A = sc.nextInt();
        B = sc.nextInt();

        Sum = A + B;

        System.out.println("Sum = " + Sum);

        sc.close();
    }
}