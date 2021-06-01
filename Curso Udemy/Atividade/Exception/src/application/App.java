package application;

import model.entities.Account;
import model.exception.DomainException;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number account: ");
        Integer number = sc.nextInt();
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Initial balance: ");
        BigDecimal balance = sc.nextBigDecimal();
        System.out.print("Enter withdraw limit: ");
        BigDecimal withdrawLimit = sc.nextBigDecimal();

        Account account = new Account(number,name,balance,withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        BigDecimal amount = sc.nextBigDecimal();
        try {
            Account.withdraw(amount);
            System.out.printf("New Balance: %.2f%n", Account.getBalance());
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("New Balance: $" + account.getBalance());

        sc.close();
    }
}
