/*************************************************************************************************************
 * 1 - Fazer um programa para ler o código de uma (peça 1) o número de (peças 1) o valor unitário de cada (peça 1).
 * 2 - O código de uma (peça 2) o número de (peças 2) e o valor unitário de cada (peça 2).
 * 3 - Calcule e mostre o valor a pago.
 **************************************************************************************************************/


import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Produto1,Produto2,quantidade1,quantidade2;
        double preço1, preço2;

        double ValorPag;

        Produto1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        preço1 = sc.nextDouble();

        Produto2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        preço2 = sc.nextDouble();

        ValorPag = preço1 * quantidade1 + preço2 * quantidade2;

        System.out.printf("Valor a ser pago: R$%.2f%n",ValorPag);

        sc.close();
    }
}