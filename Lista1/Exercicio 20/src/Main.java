import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a primeira raiz (x1): ");
        double x1 = in.nextDouble();

        System.out.print("Digite a segunda raiz (x2): ");
        double x2 = in.nextDouble();

        // Calcula os coeficientes a, b e c
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.println("x^2 + (" + b + ")x + (" + c + ") = 0");
    }
}
