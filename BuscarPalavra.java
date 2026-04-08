
import java.util.Scanner;

public class BuscarPalavra {
    public static void main(String[] args) {
        Scanner scanner = new
Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int posicao = frase.indexOf(palavra);

        if (posicao != -1){
            System.out.println("A palavra foi encontrada na posição: " + posicao);
        } else {
            System.out.println("A palavra não foi encontrada");
        }
        scanner.close();
    }
}