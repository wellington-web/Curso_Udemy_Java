/*************************************************************************************************************
 * 1 - Fazer um programa para ler os dados de um funcionário (nome, salário e imposto).
 * 2 - Mostrar os dados do funcionário (nome e salário liquido).
 * 3 - Aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto).
 * 4 - Mostrar os dados do funcionário atualizados.
 **************************************************************************************************************/

package apricativo;

import entidade.Funcionario;

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario(null, null, null, null);

        System.out.println("Digite os dados do funcionário: ");
        System.out.println();
        System.out.printf("Nome: ");
        funcionario.setNome(sc.nextLine());

        System.out.printf("Salário: ");
        funcionario.setSalarioBruto(sc.nextBigDecimal());

        System.out.printf("Imposto: ");
        funcionario.setImpostoPorc(sc.nextDouble());

        System.out.println(funcionario.toStringDadoSemAumento());

        System.out.println("Digite a porcentagem que deseja aumentar o salário do funcionário: ");
        funcionario.setAumentarPorc(sc.nextDouble());

        System.out.println(funcionario.toStringDadoComAumento());

        sc.close();
    }
}