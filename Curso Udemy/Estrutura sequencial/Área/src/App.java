/*************************************************************************************************************
 * 1 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão (A) (B) (C).
 * 2 - Calcule e mostre.
 * 3 - A área do triângulo retângulo que tem A por base e C por altura.
 * 4 - A área do círculo de raio C. (pi = 3.14159)
 * 5 - A área do trapézio que tem A e B por bases e C por altura.
 * 6 - A área do quadrado que tem lado B.
 * 7 - A área do retângulo que tem lados A e B.
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,triangle,circle,trapeze,square,rectangle;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangle = A * C / 2;
        circle = Math.pow(C, 2) * pi;
        trapeze = (A + B) / 2 * C;
        square = (B * B);
        rectangle = (A * B);

        System.out.printf("Area of Triangle: %.3f%n",triangle);
        System.out.printf("Radius of Circle C: %.3f%n",circle);
        System.out.printf("Area of Trapeze: %.3f%n",trapeze);
        System.out.printf("Area of Square: %.3f%n",square);
        System.out.printf("Area of Rectangle: %.3f%n",rectangle);

        sc.close();
    }
}