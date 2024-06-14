import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double n1,n2, n3;
        Double result;
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite dois numeros: ");
         n1= in.nextDouble();
         n2 =in.nextDouble();
        n3 = n1 + n2;
        result = n3 /2;

        System.out.println(" A média entre as duas notas é:" + result);
    }
}