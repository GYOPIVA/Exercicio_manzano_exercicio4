package ManzanoExercicio4;

import java.util.Scanner;

public class ExercicioD {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] notas = new byte[4];
        int media = 0;
        for (int i = 0; i < notas.length ; i++) {
            System.out.printf("Digite a %d° nota: \n", (i + 1));
            notas[i] = sc.nextByte();
            media += notas[i];
        }

        media = media / 4;
        String mensagem = "";
        if (media > 6) {
            mensagem = "Aluno aprovado";
        }else {
            System.out.println("Digite a nota do exame: ");
            byte notaExame = sc.nextByte();
            media = (media + notaExame) / 2;

            if (media > 4) {
                mensagem = "Aluno aprovado";
            }else {
                mensagem = "Aluno reprovado";
            }
        }
        System.out.printf("A média do aluno é: %.1f\n%s", (double) media, mensagem);
    }
}
