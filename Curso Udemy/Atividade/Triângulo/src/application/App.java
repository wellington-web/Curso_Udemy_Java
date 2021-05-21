/*************************************************************************************************************
 * 1 - Fazer um programa ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
 * 2 - Mostrar o valor das áreas dos dois triângulos.
 * 3 - Dizer qual dos dois triângulos possui a maior área.
 * 4 - A fórmula para calcular  a área de um triângulo a partir das medidas de seus lados (a,b e c).
 * 5 - (fórmula de Heron): p = (a + b + c) / 2.0; Math.sqrt(p * (p - a) * (p - b) * (p - c));
 **************************************************************************************************************/

package application;

import entity.Triangle;

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x , y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area of triangle X : %.2f%n",areaX);
        System.out.printf("Area of triangle Y : %.2f%n",areaY);

        if (areaX > areaY) {
            System.out.println("The triangle with the largest area: X");
        }
        else {
            System.out.println("The triangle with the largest area: Y");
        }
        sc.close();
    }
}