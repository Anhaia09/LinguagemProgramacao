public class Main {
    public static void main(String[] args) {
        int contador = 1;
        Personagem p1 = new Personagem("Bob Esponja");
        Personagem p2 = new Personagem("Patrick");
        Personagem p3 = new Personagem("Plankton");

        while (p1.getVida() > 0 && p2.getVida() > 0 || p1.getVida() > 0 && p3.getVida() > 0 || p2.getVida() > 0 && p3.getVida() > 0) {
            p1.atacar(p2);
            p2.atacar(p3);
            p3.atacar(p1);

            System.out.println();
            System.out.println("Round " + contador++);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        }
    }
}