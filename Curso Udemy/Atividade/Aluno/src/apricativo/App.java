/*************************************************************************************************************
 * 1 - Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trismestres do ano.
 * 2   (Primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
 * 3 - Mostrar a nota final do aluno e dizer se o aluno está aprovado (Passou) ou não (Reprovado).
 * 4 - Caso aluno seja reprovado mostrar quantos pontos faltam para passar.
 * 5 - A nota mínima para o aluno ser aprovado é (60% da nota).
 **************************************************************************************************************/

package apricativo;

import entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno(null, 0.0, 0.0, 0.0);

        System.out.println("Nome do aluno: ");
        aluno.setNome(sc.nextLine());

        do {
            System.out.println("Entre com a nota do primeiro trimestre do aluno 0 a 30 : ");
            aluno.setNota1(sc.nextDouble());

            if(aluno.getNota1() <= -1 || aluno.getNota1() >= 31 ){
                System.out.println("OPSs!! Informe um dado válido");
            }
        } while (aluno.getNota1() <= -1 || aluno.getNota1() >= 31);

        do {
            System.out.println("Entre com a nota do segundo trimestre do aluno 0 a 35 : ");
            aluno.setNota2(sc.nextDouble());

            if(aluno.getNota2() <= -1 || aluno.getNota2() >= 36 ){
                System.out.println("OPSs!! Informe um dado válido");
            }
        } while (aluno.getNota2() <= -1 || aluno.getNota2() >= 36);

        do {
            System.out.println("Entre com a nota do primeiro trimestre do aluno 0 a 35 : ");
            aluno.setNota3(sc.nextDouble());

            if(aluno.getNota3() <= -1 || aluno.getNota3() >= 36 ){
                System.out.println("OPSs!! Informe um dado válido");
            }
        } while (aluno.getNota3() <= -1 || aluno.getNota3() >= 36);

        if ( aluno.notaFinal() >= 101 || aluno.notaFinal() <= -1  ) {
            System.out.println("Soma das Notas inválida");
        }
        else if(aluno.notaFinal() >= 60){
            System.out.println(aluno.toStringFinal(aluno));
            System.out.println("Passou");
        }
        else {
            System.out.println(aluno.toStringFinal(aluno));
            System.out.println("Reprovado");
            System.out.println(aluno.toStringFaltando(aluno));
        }
        sc.close();
    }
}