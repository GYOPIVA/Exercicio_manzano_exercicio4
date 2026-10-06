package ManzanoExercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioF {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° numero:\n", (i + 1));
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Numeros em ordem: " + Arrays.toString(numeros));

    }
}
