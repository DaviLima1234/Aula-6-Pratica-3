import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palvra = scanner.nextLine();

        int quantidade = palvra.length();

        System.out.println("A palavra possui " + quantidade + " Caracteres");

        scanner.close();
    }
}