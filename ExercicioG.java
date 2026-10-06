package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° número: %n", i + 1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros divisíveis por 2 ou 3:");

        for (int numero : numeros) {
            if (numero % 2 == 0 || numero % 3 == 0) {
                System.out.print("|" +numero + "|");
            }
        }

        sc.close();
    }
}