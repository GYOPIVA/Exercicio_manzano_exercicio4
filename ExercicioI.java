package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioI {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificar par ou ímpar");
        boolean ligado = true;
        while (ligado) {
            System.out.println("Digite um numero:");
            int numeroDigitado = sc.nextInt();

            while (numeroDigitado < 0){
                System.out.println("Digite um numero maior que 0: ");
                numeroDigitado = sc.nextInt();
            }

            if (numeroDigitado % 2 == 0){
                System.out.println("O numero é um numero par");
            }else {
                System.out.println("O numero é um numero ìmpar");
            }
            System.out.println("Digite (1) para verificar outro numero | Digite (2) para parar o programa");
            String opcao = sc.next();
            if (opcao.equals("2")){
                ligado = false;
            }
        }
    }
}
