public class CaracteresString {
    public static void main(String[] args) {
        String palavra = "computação";

        char primeiro = palavra.charAt(0);
        char terceiro = palavra.charAt(2);
        char ultimo = palavra.charAt(palavra.length() -1);

        System.out.println("Primeiro caractere: " + primeiro);
        System.out.println("Terceiro caractere: " + terceiro);
        System.out.println("Ultimo caractere: " + ultimo);
    }
}