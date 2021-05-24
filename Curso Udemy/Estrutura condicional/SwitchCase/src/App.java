/*************************************************************************************************************
 * 1 - Fazer um programa para ler um valor inteiro de 1 a 7.
 * 2 - Representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
 * 3 - Mostrar na tela o dia da semana correspondente, conforme exemplos.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String day;

        switch (x) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid value";
                break;
        }

        System.out.println("Day of the week: " + day);

        sc.close();

    }
}