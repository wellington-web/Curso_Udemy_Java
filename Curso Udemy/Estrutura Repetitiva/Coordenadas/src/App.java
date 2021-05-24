/*************************************************************************************************************
 * 1 - Fazer um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 *     cartesiano.
 * 2 - Para cada ponto escrever o quadrante a que ele pertence.
 * 3 - O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
 *     (nesta situação sem escrever mensagem alguma).
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x,y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("First");
            }

            else if (x < 0 && y > 0) {
                System.out.println("Second");
            }

            else if (x < 0 && y < 0) {
                System.out.println("Third");
            }

            else {
                System.out.println("Fourth");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}