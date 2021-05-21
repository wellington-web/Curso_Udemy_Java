/*************************************************************************************************************
 * 1 - Fazer um programa para ler a cotação do dólar.
 * 2 - Ler uma quantidade de dolares a ser comprado em reais.
 * 3 - Informar a quantidade de reais a ser paga pelos dólares.
 * 4 - Considerando um IOF de 6% sobre o valor do dólar.
 **************************************************************************************************************/

package apricativo;

import entidade.Conversor;

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conversor conversor = new Conversor();

        System.out.println("Conversor de dolar / real ");
        System.out.println();

        System.out.println("Qual o preço do Dolar?");
        conversor.setDolar(sc.nextBigDecimal());

        System.out.println("Quantos dolares você quer comprar?");
        conversor.setComDolar(sc.nextBigDecimal());

        System.out.println(conversor);

        sc.close();
    }
}