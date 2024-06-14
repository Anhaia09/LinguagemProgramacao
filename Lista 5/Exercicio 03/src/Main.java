import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }

    public static double calcularPotencia(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        if (expoente < 0) {
            return 1 / (base * calcularPotencia(base, -expoente - 1));
        } else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
}

