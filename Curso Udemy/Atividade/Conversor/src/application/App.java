/*************************************************************************************************************
 * 1 - Fazer um programa para ler a cotação do dólar.
 * 2 - Ler uma quantidade de dolares a ser comprado em reais.
 * 3 - Informar a quantidade de reais a ser paga pelos dólares.
 * 4 - Considerando um IOF de 6% sobre o valor do dólar.
 **************************************************************************************************************/

package application;

import entity.Converter;

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Converter converter = new Converter();

        System.out.println("Dollar / Real Converter");
        System.out.println();

        System.out.println("What is the price of Dollar?");
        converter.setDollar(sc.nextBigDecimal());

        System.out.println("How many dollars do you want to buy?");
        converter.setBuyDollar(sc.nextBigDecimal());

        System.out.println(converter);

        sc.close();
    }
}