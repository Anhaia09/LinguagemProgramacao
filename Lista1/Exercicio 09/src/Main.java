import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double distanciaQuilometros = scanner.nextDouble();

        double distanciaMilhas = distanciaQuilometros/1.6;

        System.out.println("A distância em milhas é: " + distanciaMilhas);
    }
}
