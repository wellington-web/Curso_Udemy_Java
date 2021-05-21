/*************************************************************************************************************
 * 1 - Fazer um programa para ler os dados de um produto em estoque (nome,preço e quantidade).
 * 2 - Mostrar os dados do produto (nome, preço, quantidade no estoque,valor total no estoque).
 * 3 - Realizar uma entrada de um produto.
 * 4 - Mostrar os dados do produto.
 * 5 - Realizar uma saída de produto.
 * 6 - Mostrar os dados do produto.
 **************************************************************************************************************/

package apricativo;

import entidade.Product;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(null,null,0);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.setName(sc.nextLine());

        System.out.print("Price: ");
        product.setPrice(sc.nextBigDecimal());

        System.out.print("Quantity in stock: ");
        product.setStock(sc.nextInt());

        System.out.println(product);
        System.out.println();

        System.out.print("Enter the quantity of products you want to add: ");
        Integer stockAdd = sc.nextInt();
        product.stockAdd(stockAdd);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the quantity of products you want to withdraw: ");
        Integer quantityWithdraw = sc.nextInt();
        product.withdrawStock(quantityWithdraw);

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }
}