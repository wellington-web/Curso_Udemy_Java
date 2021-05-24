/*************************************************************************************************************
 * 1 - Fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos intervalos
 *     ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
 * 2 - Obviamente se o valor não estiver em nenhum destes intervalos
 *     deverá ser impressa a mensagem “Fora de intervalo”
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter a number:");
        number = sc.nextInt();

        if ( number < 0.0 || number > 100.00) {
            System.out.println("The number entered is out of range");
        }
        else if (number <= 25.00) {
            System.out.println("The number is in the range of 0 a 25");
        }
        else if (number <= 50.00) {
            System.out.println("The number is in the range of 25 a 50");
        }
        else if (number <= 75.00) {
            System.out.println("The number is in the range of 50 a 75");
        }
        else {
            System.out.println("The number is in the range of 75 a 100");
        }
        sc.close ();

    }
}