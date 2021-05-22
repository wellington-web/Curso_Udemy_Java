/*************************************************************************************************************
 * 1 - Fazer um programa para ler os valores da altura e base de um retângulo.
 * 2 - Mostrar os valores (área, perímetro e diagonal).
 * 3 - Área: (altura * base).
 * 4 - Perímetro: (altura * 2) + (base * 2).
 * 5 - Diagonal: raiz quadrada de (altura²) + (base²) ou Diagonal² = (altura²) + (base²).
 ***************************************************************************************************************/

package application;

import entity.Rectangle;

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter with the height of rectangle: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Enter with the base of rectangle: ");
        rectangle.base = sc.nextDouble();

        Double area = rectangle.area();
        Double perimeter = rectangle.perimeter();
        Double diagonal = rectangle.diagonal();

        System.out.printf("Area: %.2f%n",area);

        System.out.printf("Perimeter: %.2f%n",perimeter);

        System.out.printf("Diagonal: %.2f%n",diagonal);

        sc.close();
    }
}