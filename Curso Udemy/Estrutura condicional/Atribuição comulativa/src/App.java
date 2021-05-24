/*************************************************************************************************************
 * Enunciado - Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
 * Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
 1 Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();

        double bill = 50.0;
        if (minutes > 100) {
            bill += (minutes - 100) * 2.0;
        }

        System.out.printf("Value of  = R$ %.2f%n",bill);

        sc.close();
    }
}