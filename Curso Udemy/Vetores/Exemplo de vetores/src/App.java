/*************************************************************************************************************
 * 1 - Fazer um programa para ler um número inteiro (N) e a altuda de (N) pessoas.
 * 2 - Armazene as N alturas em um vetor.
 * 3 - Mostrar a altura média dessas pessoas.
 **************************************************************************************************************/


import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vector = new double[n];


        for (int i=0; i<n; i++){
            System.out.printf("Inform %2of. value de %d: ", (i+1), n);
            vector[i] = sc.nextDouble();
        }
        double sum = 0.0;

        for (int i=0; i<n; i++){
            sum += vector[i];
        }
        double average = sum / n;

        System.out.printf("Average: %.2f%n", average);

        sc.close();
    }
}