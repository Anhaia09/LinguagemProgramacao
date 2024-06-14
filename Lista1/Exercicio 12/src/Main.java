import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota N1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota N2: ");
        double n2 = scanner.nextDouble();

        // Calcula a média ponderada com N1 peso 1 e N2 peso 2
        double media = (n1 + n2*2) / 3;


        System.out.println("A média é: " + media);
    }
}
