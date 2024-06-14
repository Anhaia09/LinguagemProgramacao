import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em milímetros: ");
        double medidaMilimetros = scanner.nextDouble();

        // 1 milímetro é equivalente a 0.0393701 polegadas
        double medidaPolegadas = medidaMilimetros * 0.0393701;

        System.out.println("A medida em polegadas é: " + medidaPolegadas);
    }
}
