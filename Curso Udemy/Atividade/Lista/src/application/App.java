/*************************************************************************************************************
 * 1 - Fazer um programa para ler um número inteiro (N) e depois os dados (id,nome e salario) de N funcionários.
 * 2 - Não deve haver repetição de id.
 * 3 - Efetuar o aumento de X por cento no salário de um determinado funcionário.
 * 4 - Programa deve ler um ID e o valor X.
 * 5 - Se o ID informado não existir, mostrar uma mensagem e abortar a operação.
 * 6 - Mostrar a listagem atualizada dos funcionários.
 * 7 - Apricar a técnica de encapsulamento.
 * 8 - Salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
 **************************************************************************************************************/

package application;

import entity.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees do you want to register: " );
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println("Employed " + (i + 1) + " : ");

            System.out.print("Enter the employed ID: ");
            Integer id = sc.nextInt();
            while (hasId(list,id)) {
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Enter employed name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter employee salary: ");
            BigDecimal salary = sc.nextBigDecimal();

            Employee emp = new Employee(id,name,salary);
            System.out.println();

            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        Integer idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, Integer id) {
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee>list,Integer id) {
        Employee emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }
}