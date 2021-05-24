/*************************************************************************************************************
 * 1 - Fazer um programa para ler um número (N).
 * 2 - Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
 * 3 - Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0 ; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Impossible division");
            }
            else {
                double division = (double) x / y;
                System.out.printf("%.1f%n",division);
            }
        }
        sc.close();
    }
}