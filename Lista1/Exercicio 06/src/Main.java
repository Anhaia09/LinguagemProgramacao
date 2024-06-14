import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double velocidadeMS, velocidadeKmH;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        velocidadeMS = input.nextDouble();

        velocidadeKmH = velocidadeMS * 3.6;

        System.out.println("A velocidade em Km/h é: " + velocidadeKmH);
    }
}

