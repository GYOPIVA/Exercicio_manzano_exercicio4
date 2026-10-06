package ManzanoExercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioH {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° número: %n", i + 1);
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.printf("Maior Numero: %d\n" +
                "Menor Numero: %d", numeros[4], numeros[0]);
        sc.close();
    }

}
