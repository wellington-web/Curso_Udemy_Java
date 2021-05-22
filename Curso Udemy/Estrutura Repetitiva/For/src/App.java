/*************************************************************************************************************
 * 1 - For é uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
 * 2 - for ( início ; condição ; incremento) {
 *           comando 1
 *           comando 2
 *     }
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer sum = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            sum += x;
        }

        System.out.println(sum);

        sc.close();
    }
}