import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        long multiplicacao = 1; // Usamos long caso o resultado seja um número muito grande

        // Entrada de dados e Processamento
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = teclado.nextInt();

            soma += numeros[i];            // Acumula a soma
            multiplicacao *= numeros[i];    // Acumula a multiplicação
        }

        // Saída de dados
        System.out.println("\n--- RESULTADOS ---");
        
        System.out.print("Os números digitados foram: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? ", " : ""));
        }

        System.out.println("\nSoma de todos os números: " + soma);
        System.out.println("Multiplicação de todos os números: " + multiplicacao);

        teclado.close();
    }
}