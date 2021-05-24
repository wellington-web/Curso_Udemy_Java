package application;

import entity.Product;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();
            System.out.print("Enter the Price: ");
            Double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            System.out.printf("Inform %2of. value of %d: %s", (i+1), n,vect[i]);
        }

        double sum = 0.0;

        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

//      for (Product value : vect) {
//          sum += value.getPrice();
//      }
        Double average = sum / vect.length;

        System.out.printf("Average price = %.2f%n", average);
        System.out.println();
        System.out.println("Show stored information: ");

        for (int i=0; i<vect.length; i++){
            Product product = new Product(vect[i].getName(),vect[i].getPrice());
            System.out.printf("%s",product);
        }

//      for (Product value : vect) {
//          Product product = new Product(value.getName(), value.getPrice());
//          System.out.printf("%s", product);
//      }

        sc.close();
    }
}