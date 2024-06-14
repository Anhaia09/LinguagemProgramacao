import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente 'b': ");
        double b = scanner.nextDouble();

            // Calcula a solução para a equação do primeiro grau: ax + b = 0
            double solucao = -b / a;
            System.out.println("A solução da equação é x = " + solucao);
        }
    }

