public class SubstringExemplo {
    public static void main(String[] args) {
        String palavra = "programação";

        String parte1 = palavra.substring(0, 8); 
        String parte2 = palavra.substring(8);    

        System.out.println("Primeira parte: " + parte1);
        System.out.println("Segunda parte: " + parte2);
    }
} 