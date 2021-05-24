/*************************************************************************************************************
 Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.
( condição ) ? valor_se_verdadeiro : valor_se_falso
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price,discount;

        System.out.println("Price of the product?");
        price = sc.nextDouble();

        discount = (price < 30.0) ? price * 0.1 : price * 0.05;

        System.out.printf("Total discount: R$%.2f%n",discount);

        sc.close();
    }
}