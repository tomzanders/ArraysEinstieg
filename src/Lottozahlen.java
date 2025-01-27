import java.util.Arrays;
import java.util.Random;

public class Lottozahlen {
    public int[] lottoListe;

    public void lottozahlenErzeugen() {
        Random randint = new Random();
        lottoListe = new int[6];
        for (int i = 0; i < lottoListe.length; i++) {
            lottoListe[i] = randint.nextInt(49) + 1;
        }
    }

    public static void main(String[] args) {
        Lottozahlen lotto = new Lottozahlen();

        lotto.lottozahlenErzeugen();
        Arrays.sort(lotto.lottoListe);

        Arrays.stream(lotto.lottoListe).forEach(System.out::println);

        //System.out.println(Arrays.toString(lotto.lottoListe));
    }
}
