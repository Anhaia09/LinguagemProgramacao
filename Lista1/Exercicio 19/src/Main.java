import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o coeficiente 'a': ");
        double a = in.nextDouble();

        // Verificação para evitar divisão por zero
        if (a == 0) {
            System.out.println("O coeficiente 'a' não pode ser zero em uma equação do segundo grau.");
            return;
        }
        System.out.print("Digite o coeficiente 'b': ");
        double b = in.nextDouble();

        System.out.print("Digite o coeficiente 'c': ");
        double c = in.nextDouble();

        // Calcula o discriminante (b^2 - 4ac)
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Duas soluções reais distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As soluções reais são: x1 = " + x1 + " e x2 = " + x2);
        } else if (discriminante == 0) {
            // Uma solução real (raiz dupla)
            double x = -b / (2 * a);
            System.out.println("A solução real é: x = " + x);
        } else {
            // Nenhuma solução real (soluções imaginárias)
            System.out.println("A equação não possui soluções reais.");
        }
    }
}
