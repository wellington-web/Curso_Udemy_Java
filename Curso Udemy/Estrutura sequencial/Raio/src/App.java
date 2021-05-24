/*************************************************************************************************************
 * 1 - Faça um programa para ler o valor do raio de um círculo.
 * 2 - Depois mostrar o valor da área deste círculo com quatro casas decimais.
 * 3 - Fórmula da área: area = π . raio2
 * 4 - Considere o valor deπ = 3.14159
 **************************************************************************************************************/

public class App {

    public static void main(String[] args) {

        double π = 3.14159;
        double y = 2.00;
        double i = 100.64;
        double o = 150.00;

        double A, B, C;

        A = Math.pow(y, 2);
        B = Math.pow(i, 2);
        C = Math.pow(o, 2);

        double area = π * A;
        double area1 = π * B;
        double area2 = π * C;

        System.out.printf("A = %.4f%n",area);
        System.out.printf("A = %.4f%n",area1);
        System.out.printf("A = %.4f%n",area2);
    }
}