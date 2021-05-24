/*************************************************************************************************************
 * 1 - Fazer um programa que leia o número de um funcionário (Horas trabalhadas) e o (Valor recebe por Hora).
 * 2 - Calcular o salário desse funcionário.
 * 3 - Mostre o número e o salário do funcionário, com duas casas decimais.
 **************************************************************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, hourWorking;
        double valueHourWorking;

        id = sc.nextInt();
        hourWorking = sc.nextInt();
        valueHourWorking = sc.nextDouble();

        double salary = hourWorking * valueHourWorking;

        System.out.println("Numero Do Funcionario: " + id);
        System.out.printf("Salario a Receber: R$ %.2f%n",salary );

        sc.close();
    }
}