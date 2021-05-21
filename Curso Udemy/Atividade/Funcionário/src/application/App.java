/*************************************************************************************************************
 * 1 - Fazer um programa para ler os dados de um funcionário (nome, salário e imposto).
 * 2 - Mostrar os dados do funcionário (nome e salário liquido).
 * 3 - Aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto).
 * 4 - Mostrar os dados do funcionário atualizados.
 **************************************************************************************************************/

package application;

import entity.Employed;

import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employed employed = new Employed();

        System.out.println("Enter employee data: ");
        System.out.println();
        System.out.print("Name: ");
        employed.setName(sc.nextLine());

        System.out.print("Salary: ");
        employed.setGrossSalary(sc.nextBigDecimal());

        System.out.print("Tax: ");
        employed.setTaxPercentage(sc.nextDouble());

        System.out.println(employed.toStringDataSalaryWithoutIncrease());

        System.out.println("Enter the percentage you want to increase the employee's salary: ");
        employed.setPercentageOfIncrease(sc.nextDouble());

        System.out.println(employed.toStringDataSalaryWithIncrease());

        sc.close();
    }
}