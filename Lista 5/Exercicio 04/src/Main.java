import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String palavra = scanner.nextLine();

        if (ePalindromo(palavra)) {
            System.out.println("A palavra/frase é um palíndromo.");
        } else {
            System.out.println("A palavra/frase não é um palíndromo.");
        }
    }

    public static boolean ePalindromo(String palavra) {
        if (palavra.length() <= 1) {
            return true; // Uma string de comprimento 0 ou 1 é sempre um palíndromo
        } else {
            char primeiro = palavra.charAt(0);
            char ultimo = palavra.charAt(palavra.length() - 1);
            // Verifica se o primeiro e o último caractere são iguais e chama a função recursivamente
            // com a string sem esses caracteres
            return primeiro == ultimo && ePalindromo(palavra.substring(1, palavra.length() - 1));
        }
    }
}
