package application;

import entities.LegalEntity;
import entities.People;
import entities.PhysicalPerson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<People> list = new ArrayList<>();

        System.out.print("Enter the number of tax  payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("Tax payer " + i + " data:");
            System.out.println("Individual or company (i/c)?");
            char resp = sc.next().charAt(0);

            System.out.println("Enter data");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income:");
            BigDecimal anualIncome = sc.nextBigDecimal();

            if (resp == 'i') {
                System.out.print("Health expenditures: ");
                BigDecimal healthExpenditures = sc.nextBigDecimal();
                list.add(new PhysicalPerson(name,anualIncome,healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                Integer employees = sc.nextInt();
                list.add(new LegalEntity(name,anualIncome,employees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (People pay : list) {
            System.out.println(pay.getName() + ": $ " + String.format("%.2f", pay.taxe()));
        }

        System.out.println();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (People pay : list) {
            sum.add(sum).add((BigDecimal) pay.taxe());
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
