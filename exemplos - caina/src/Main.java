import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        r.setSeed(42);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        r.setSeed(50);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        r.setSeed(42);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

    }
}