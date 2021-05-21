/*************************************************************************************************************
 * 1 - A dona de um pensionato possui dez quartos de para alugar para estudantes,sendo esses quartos
 *     identificados pelos números 0 a 9.
 * 2 - Fazer um programa que inicie com todos os dez quartos vazios.
 * 3 - Leia uma quantidade (n) representando o número de estudantes que vão alugar os quartos
 *     (n) pode ser de um 1 a 10.
 * 4 - Informar os dados do estudante (nome e email) bem como qual dos quartos ele escolheu (0 a 9).
 * 5 - Suponha que seja escolhido um quarto vago.
 * 6 - Informar um relátorio de todas as ocupações do pensinato ( Por ordem de quarto).
 **************************************************************************************************************/

package application;

import entity.Room;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] vect = new Room[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i=1; i <= n; i++){
            sc.nextLine();
            System.out.print("Which student name: ");
            String name = sc.nextLine();

            System.out.print("Which student email: ");
            String email = sc.nextLine();

            System.out.print("Which room will be rented: ");
            Integer nRoom = sc.nextInt();
            vect[nRoom] = new Room(name, email);
            Room room = new Room(name, email);

            System.out.printf("Inform %2do. of %d: Room:%d %s \n",(i),n,nRoom,room);
            System.out.println("Next room.");
        }
        for (int i=0; i<10; i++){
            if (vect[i] != null){
                System.out.println("Allocated room: " + i + ", " + vect[i]);
            }
        }
        sc.close();
    }
}