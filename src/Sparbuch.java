public class Sparbuch {
    public static void main(String[] args) {
        double[] einzahlungslisteKonstruktor = {
                1000, 1000, 800, 1300
        };


        double[] einzahlungslisteDeklarierung = new double[4];
        einzahlungslisteDeklarierung[0] = 1000;
        einzahlungslisteDeklarierung[1] = 1000;
        einzahlungslisteDeklarierung[2] = 800;
        einzahlungslisteDeklarierung[3] = 1300;

        System.out.println("Konstruktor Init");
        for (double in : einzahlungslisteKonstruktor) {
            System.out.println(in);
        }

        System.out.println("\nDeklarierung Init");
        for (double in : einzahlungslisteDeklarierung) {
            System.out.println(in);
        }
    }
}