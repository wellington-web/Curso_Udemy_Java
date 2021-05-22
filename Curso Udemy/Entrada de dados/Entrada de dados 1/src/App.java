import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //char x;
        //double x;
        //int x;
        String x;

        //x = sc.next().charAt(0);
        //x = sc.nextDouble();
        //x = sc.nextInt();
        x = sc.next();

        System.out.println("You typed: " + x);
        //System.out.printf("You typed: %.2f%n");

        //Se usa Locale.setDefault(Locale.US); ou System.out.printf dependendo de como você quer a saida de dado, com "." ou ","

        sc.close();
    }
}