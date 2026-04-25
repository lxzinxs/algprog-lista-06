import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um texto de 10 caracteres para saber quantas consoante: ");
        String entrada = teclado.nextLine().toLowerCase().trim();

        char[] caracteres = entrada.toCharArray();

        int totalConsoantes = 0;
        String consoantesEncontradas = "";

        for(int i = 0; i < caracteres.length; i++){
            char c = caracteres[i];

            if(c >= 'a' && c <= 'z'){
                if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                    totalConsoantes++;
                    consoantesEncontradas += c + "";
                }
            }
        }
        System.out.println("Total de consoantes: " + totalConsoantes);
        System.out.println("Consoantes: " + consoantesEncontradas);

        teclado.close();
    }    
}
