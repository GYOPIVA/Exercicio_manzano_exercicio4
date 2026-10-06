package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioJ {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 9");
        int num = sc.nextInt();
        while (num < 1 || num > 9) {
            System.out.println(
                    "O valor está fora da faixa permitida");
            System.out.println("Digite um numero de 1 a 9");
            num = sc.nextInt();
        }
        System.out.println(
                "O valor está na faixa permitida");
    }
}
