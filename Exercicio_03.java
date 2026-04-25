import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        int[] notas = new int[4];
        int soma = 0;


        for(int i = 0; i < 4; i++){
            System.out.println("Digite as suas notas: ");
            notas[i] = teclado.nextInt();
            soma = soma +  notas[i];
        }
        System.out.println("As suas notas sao: "
        );

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        double media = soma / 4;

        System.out.println("A media da suas notas são: " + media);
    }
}
