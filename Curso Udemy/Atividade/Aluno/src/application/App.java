/*************************************************************************************************************
 * 1 - Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trismestres do ano.
 * 2   (Primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
 * 3 - Mostrar a nota final do aluno e dizer se o aluno está aprovado (Passou) ou não (Reprovado).
 * 4 - Caso aluno seja reprovado mostrar quantos pontos faltam para passar.
 * 5 - A nota mínima para o aluno ser aprovado é (60% da nota).
 **************************************************************************************************************/

package application;

import entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Student's name: ");
        student.setName(sc.nextLine());

        do {
            System.out.println("Enter the student's grade for the first trimester 0 to 30 : ");
            student.setFirstNote(sc.nextDouble());

            if(student.getFirstNote() <= -1 || student.getFirstNote() >= 31 ){
                System.out.println("OPSs!! Enter a valid data");
            }
        } while (student.getFirstNote() <= -1 || student.getFirstNote() >= 31);

        do {
            System.out.println("Enter the student's grade for the second trimester 0 to 35 : ");
            student.setSecondNote(sc.nextDouble());

            if(student.getSecondNote() <= -1 || student.getSecondNote() >= 36 ){
                System.out.println("OPSs!! Enter a valid data");
            }
        } while (student.getSecondNote() <= -1 || student.getSecondNote() >= 36);

        do {
            System.out.println("Enter the student's grade for the third trimester 0 to 35 : ");
            student.setThirdNote(sc.nextDouble());

            if(student.getThirdNote() <= -1 || student.getThirdNote() >= 36 ){
                System.out.println("OPSs!! Enter a valid data");
            }
        } while (student.getThirdNote() <= -1 || student.getThirdNote() >= 36);

        if  (student.finalGrade() >= 60){
            System.out.println(student.toStringFinal(student));
            System.out.println("Passed on");
        }
        else {
            System.out.println(student.toStringFinal(student));
            System.out.println("Disapproved");
            System.out.println(student.toStringMissing(student));
        }
        sc.close();
    }
}