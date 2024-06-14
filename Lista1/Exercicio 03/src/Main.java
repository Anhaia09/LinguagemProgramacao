import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println( "Leia um numero real: ");
        number = in.nextDouble();
        result = number /5;
        System.out.println("A quinta parte do numero digitado é:" + result);
    }
}