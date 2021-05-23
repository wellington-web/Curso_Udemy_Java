/*************************************************************************************************************
 * 1 - Fazer um programa que repita a leitura de uma senha até que ela sejá válida.
 * 2 - Para cada leitura de senha incorreta, escrever a mensagem "Senha inválida.
 * 3 - Quando informado a senha correta, escrever a mensagem "Acesso liberado".
 * 4 - Considere que a senha é o valor de 2002.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Password: ");
        int password = sc.nextInt();

        while (password != 2002){
            System.out.println("Invalid password");
            password = sc.nextInt();

        }
        System.out.println("Access released");

        sc.close();
    }
}