 import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                double velocidadeKmH, velocidadeMS;
                Scanner input = new Scanner(System.in);

                System.out.print("Digite a velocidade em Km/h: ");
                velocidadeKmH = input.nextDouble();

                velocidadeMS = (velocidadeKmH * 1000) / 3600;

                System.out.println("A velocidade em m/s é: " + velocidadeMS);
            }
        }
