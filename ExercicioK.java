package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num <= 3) {
            System.out.println("Valor digitado: " + num);
        } else {
            System.out.println("O valor é maior que 3.");
        }

        sc.close();
    }
}