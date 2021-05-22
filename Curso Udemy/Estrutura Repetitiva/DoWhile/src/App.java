/*************************************************************************************************************
 * 1 - Fazer um programa para ler uma temperatura em Celsius.
 * 2 - Mostrar o equivalente em Fahrenheit.
 * 3 - Perguntar se o usuário deseja repetir (y/n).
 * 4 - Caso o usuário digite "y", repetir o programa.
 * 5 - Formula = 9.0 * Celsius / 5.0 + 32.0.
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Enter the temperature in degrees Celsius: ");
            Double Celsius = sc.nextDouble();
            Double Fahrenheit = 9.0 * Celsius / 5.0 + 32.0;
            System.out.printf("Fahrenheit equivalent: %.1f%n", Fahrenheit);
            System.out.print("Repeat (y/n)? ");
            resp = sc.next().charAt(0);
        }
        while (resp != 'n');

        sc.close();
    }
}