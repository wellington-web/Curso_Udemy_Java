/*************************************************************************************************************
 * 1 - Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
 * 2 - Fazer um programa para um tipo de combustível abastecido (1.Álcool) (2.Gasolina) (3.Diesel) (4.Fim).
 * 3 - Caso o usuário informe um código inválido (fora da faixa 1 a 4).
 * 4 - Deve ser solicitado um novo código (até que seja válido).
 * 5 - O programa será encerrado quando o código informado for o número 4.
 * 6 - Deve ser escrito a mensagem: (MUITO OBRIGADO).
 * 7 - Mostrar a quantidade de clientes que abasteceram cada tipo de combustível.
 **************************************************************************************************************/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcohol,gasoline,diesel,chose;
        alcohol = 0;
        gasoline = 0;
        diesel = 0;

        System.out.println("What do you want to supply?");

        chose = sc.nextInt();

        while (chose != 4){

            if (chose == 1) {
                alcohol += 1;
            }
            else if (chose == 2) {
                gasoline += 1;
            }
            else if (chose == 3) {
                diesel += 1;
            }
            chose = sc.nextInt();
        }

        System.out.println("Muito obrigado");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}