/*************************************************************************************************************
 * 1 - Fazer um programa  que leia um valor inteiro (N).
 * 2 - Este valor será a quantidade de valores X que serão lidos.
 * 3 - Mostre quantos destes valores X estão dentro do intervalo [10,20].
 * 4 - Mostre quantos estão fora do intervalo.
 * 5 - In (dentro) e Out (Fora).
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i=N; i<=N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.println(in +" in");
        System.out.println(out +" out");

        sc.close();
    }
}