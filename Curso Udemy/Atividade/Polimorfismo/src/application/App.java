package application;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class App {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("How many products do you want to register : ");
        int n = sc.nextInt();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        for (int i=1; i<=n; i++) {
            System.out.println("Product " + i + ":");
            System.out.print("Common,used or imported (c/u/i)");
            char resp = sc.next().charAt(0);

            System.out.println("Product");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            BigDecimal price = sc.nextBigDecimal();

            if (resp == 'c') {
                list.add(new Product(name, price));
            } else if (resp == 'i') {
                System.out.print("Customs fee:");
                BigDecimal customsFee = sc.nextBigDecimal();
                list.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactere = sdf1.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactere));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product prod : list) {
            System.out.println(prod.tag());

        }
    }
}

