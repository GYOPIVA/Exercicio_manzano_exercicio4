package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Ilmo Sr. " + nome + ", Bem vindo!");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Ilma Sra. " + nome + ", Bem vinda!");
        } else {
            System.out.println("Sexo inválido.");
        }

        sc.close();
    }
}