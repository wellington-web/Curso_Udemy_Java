import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Double o = 52.45;

        Integer y = 32;
        Double x = 1.575554;
        Double a = 10.58784;

        String name = "Maria";
        Integer age = 31;
        Double salary = 4000.0;

        System.out.println("Bom dia");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("Result = %.2f Meters %n", a);

        System.out.println("Result = " + o + " Meters");

        System.out.printf("%s has %d age and receive R$ %.2f in real%n", name, age, salary);
    }
}