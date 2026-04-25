import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite os 20 números: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + "* numero: ");
            numeros[i] = teclado.nextInt();

            if(numeros[i] % 2 == 0){
                par[contPar] = numeros[i];
                contPar++;
            } else {
                impar[contImpar] = numeros[i];
                contImpar++;
            }
        }
        System.out.println("numeros impar: ");
       for (int i = 0; i < contPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.print("\nNúmeros Ímpares: ");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(impar[i] + " ");
        }
        
        teclado.close();

    }
}
