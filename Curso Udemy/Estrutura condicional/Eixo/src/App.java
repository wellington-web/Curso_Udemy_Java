/*************************************************************************************************************
 * 1 - Leia 2 valores com uma casa decimal (x e y) que devem representar as coordenadas de um ponto em um plano.
 * 2 - Determine qual o quadrante ao qual pertence o ponto.
 *     (ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0))
 *      Se o ponto estiver na origem, escreva a mensagem “Origem”.
 *      Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”.
 * 3 - Conforme for a situação.
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x,y;

        System.out.println("Enter with first position:");
        x = sc.nextDouble();
        System.out.println("Enter with second position:");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("This is the point of origin.");
        }
        else if (x == 0.0) {
            System.out.println("Axis x");
        }
        else if (y == 0.0) {
            System.out.println("Axis y");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrant 1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrant 2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrant 3");
        }
        else {
            System.out.println("Quadrant 4");
        }

        sc.close();
    }
}