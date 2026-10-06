package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numerosDigitados = new int[3];

        for (int i = 0; i < numerosDigitados.length; i++) {

            System.out.printf("Digite o %d° numero: %n", i + 1);
            numerosDigitados[i] = sc.nextInt();

            if (i == 0) {
                while (numerosDigitados[0] == 0) {
                    System.out.println("A não pode ser 0. Digite novamente:");
                    numerosDigitados[0] = sc.nextInt();
                }
            }
        }

        int a = numerosDigitados[0];
        int b = numerosDigitados[1];
        int c = numerosDigitados[2];

        double delta = Math.pow(b, 2) - (4 * a * c);

        System.out.printf("A = %d | B = %d | C = %d%n", a, b, c);
        System.out.printf("Delta = %.2f%n", delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {

            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("X1 = %.2f%n", x1);
            System.out.printf("X2 = %.2f%n", x2);
        }

        sc.close();
    }
}