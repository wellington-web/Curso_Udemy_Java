/*************************************************************************************************************
 * 1 - Fazer um programa para cadastrar uma conta bancaria (nome do titular,numero da conta).
 * 2 - Abertura da conta deverá ter opção de deposito inicial ou não.
 * 3 - Uma que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
 * 4 - Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome).
 * 5 - O saldo da conta não pode ser alterado livremente (deve ser alterado só por saque ou depósito).
 * 6 - Para cada saque realizado, o banco cobra uma taxa de $ 5.00.
 * 7 - O saldo da conta pode se tornar negativo, caso não tenha saldo para saque ou taxa.
 * 8 - Deve ser realizado um depósito e depois um saque, sempre mostrando os dados atualizados.
 **************************************************************************************************************/

package application;

import entity.Account;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Enter account number: ");
        Integer accountNumber = sc.nextInt();

        System.out.println("Enter the name of the holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Initial deposit? (y/n)");
        char resp = sc.next().charAt(0);

        if (resp == 'y'){
            System.out.println("Enter deposit amount: ");
            BigDecimal initialDeposit = sc.nextBigDecimal();
            account = new Account(holder, accountNumber, initialDeposit);
        }
        else {
            account =new Account(holder, accountNumber);
        }

        System.out.println();
        System.out.println("Upgraded account: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter the deposit amount: ");
        BigDecimal depositAmount = sc.nextBigDecimal();
        account.deposit(depositAmount);

        System.out.println("Upgraded account: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter the withdrawal amount: ");
        BigDecimal withdrawalAmount = sc.nextBigDecimal();
        account.withdraw(withdrawalAmount);

        System.out.println("Upgraded account: ");
        System.out.println(account);

        sc.close();
    }
}