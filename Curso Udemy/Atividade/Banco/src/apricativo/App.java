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

package apricativo;

import entidade.Conta;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Entre com numero da conta: ");
        Integer numero = sc.nextInt();

        System.out.println("Entre com o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println("Deposito inicial? (s/n)");
        char resp = sc.next().charAt(0);

        if (resp == 's'){
            System.out.println("Entre com o valor do deposito: ");
            BigDecimal depositoInit = sc.nextBigDecimal();
            conta = new Conta(titular, numero, depositoInit);
        }
        else {
            conta =new Conta(titular, numero);
        }

        System.out.println();
        System.out.println("Conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do deposito: ");
        BigDecimal valorDeposito = sc.nextBigDecimal();
        conta.deposito(valorDeposito);

        System.out.println("Conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do saque: ");
        BigDecimal saque = sc.nextBigDecimal();
        conta.saque(saque);

        System.out.println("Conta atualizada: ");
        System.out.println(conta);

        sc.close();
    }
}