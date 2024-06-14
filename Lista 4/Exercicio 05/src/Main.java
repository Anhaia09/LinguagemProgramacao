import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vector = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotcev = new int[vector.length]; // Cria um segundo vetor com o mesmo tamanho

        // Cria uma cópia invertida do vetor1 em vetor2
        //Para acessar o último elemento de um array de comprimento n, você usa n - 1
        for (int i = 0; i <vector.length; i++){
            rotcev[(vector.length - 1)-i] = vector[i];
        }

        // Exibe vetor1
        System.out.println("Vetor 1:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        // Exibe vetor2 (cópia invertida de vetor1)
        System.out.println("Vetor 2:");
        for (int i = 0; i < rotcev.length; i++) {
            System.out.print(rotcev[i] + " ");
        }
        System.out.println();
    }
}