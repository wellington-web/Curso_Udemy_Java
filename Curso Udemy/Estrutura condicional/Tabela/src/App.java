/*************************************************************************************************************
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
 * seguir, calcule e mostre o valor da conta a pagar.
 * codigo   especificação        preço
 *   1      cachorro quente    R$ 4.00
 *   2      x-salada           R$ 4.50
 *   3      x-bacon            R$ 5.00
 *   4      torrada simples    R$ 2.00
 *   5      refrigerante       R$ 1.50
 **************************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        double Quantity, pay;

        System.out.println("What product do you want?");
        id = sc.nextInt();
        System.out.println("How many do you want?");
        Quantity = sc.nextInt();

        if (id == 1){
            pay = (Quantity * 4.00);
            System.out.printf("Value to pay R$ %.2f%n", pay);
        }
        else if (id == 2){
            pay = (Quantity * 4.50);
            System.out.printf("Value to pay R$ %.2f%n", pay);
        }
        else if (id == 3) {
            pay = (Quantity * 5.00);
            System.out.printf("Value to pay R$ %.2f%n", pay);
        }
        else if (id == 4) {
            pay = (Quantity * 2.00);
            System.out.printf("Value to pay R$ %.2f%n", pay);
        }
        else if (id == 5) {
            pay = (Quantity * 1.50);
            System.out.printf("Value to pay R$ %.2f%n", pay);
        }

        sc.close();

    }
}