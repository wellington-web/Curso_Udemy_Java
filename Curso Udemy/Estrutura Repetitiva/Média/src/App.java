/*************************************************************************************************************
 * 1 - Fazer um para ler um número inteiro (N).
 * 2 - Representando o número de testes.
 * 3 - Cada caso de teste consiste de 3 valores reais (Cada um deles com uma casa decimal).
 * 4 - Mostrar a média ponderada para cada um dos casos (conjuntos de 3 valores).
 * 5 - Sendo que primeiro valor tem peso (2) segundo (3) e terceiro (5).
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            double value1 = sc.nextDouble();
            double value2 = sc.nextDouble();
            double value3 = sc.nextDouble();

            Double average = (value1 * 2.0 + value2 * 3.0 + value3 * 5.0) /10.0;

            System.out.printf("%.1f%n", average);
        }

        sc.close();
    }
}
