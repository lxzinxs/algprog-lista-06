import java.util.Scanner;

public class Exercicio_01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];
        int i = 0;

        for (int valor : numeros) {
            System.out.println("Digite um número: ");
            numeros[i] = teclado.nextInt();
            i++;
        }

        System.out.println("nummeros digitados:");

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}