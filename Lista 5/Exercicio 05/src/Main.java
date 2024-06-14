import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 7, 10, 24, 45, 62, 35, 71, 90, 120};
        int elemento = 35;

        int resultado = buscaLinear(array, elemento);

        if (resultado == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado no índice: " + resultado);
        }
    }

    // Método para busca linear no array
    public static int buscaLinear(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i; // Retorna o índice onde o elemento foi encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado no array
    }
}
