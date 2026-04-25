import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva os números: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Números digitados: ");

        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
