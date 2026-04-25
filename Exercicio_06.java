import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] alunos = new String[10];
        double[] medias = new double[10];
        int contAprovados = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("\nNome do " + (i + 1) + "º aluno: ");
            alunos[i] = teclado.next();

            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                soma += teclado.nextDouble();
            }
            
            medias[i] = soma / 4;

            if (medias[i] >= 7.0) {
                contAprovados++;
            }
        }

        System.out.println("\n--- ALUNOS APROVADOS (MÉDIA >= 7.0) ---");
        boolean nenhumAprovado = true;

        for (int i = 0; i < alunos.length; i++) {
            if (medias[i] >= 7.0) {
                System.out.printf("Aluno: %s | Média: %.2f\n", alunos[i], medias[i]);
                nenhumAprovado = false;
            }
        }

        if (nenhumAprovado) {
            System.out.println("Nenhum aluno atingiu a média.");
        }

        System.out.println("\nTotal de alunos aprovados: " + contAprovados);
        
        teclado.close();
    }
}