/*************************************************************************************************************
 * 1 - Leia a hora inicial e a hora final de um jogo.
 * 2 - Calcule a duração do jogo.
 * 3 - Sabendo que o mesmo pode começar em um dia e terminar em outro.
 * 4 - Tendo uma duração mínima de 1 hora e máxima de 24 horas.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startTime,finalHour,Result;

        System.out.println("What time the game started?");
        startTime = sc.nextInt();

        System.out.println("When he finishes?");
        finalHour = sc.nextInt();

        if (startTime < finalHour){
            Result = finalHour - startTime;
        }
        else {
            Result = 24 - startTime + finalHour;
        }

        System.out.println("The game lasted " + Result + " hours " );

        sc.close();
    }
}