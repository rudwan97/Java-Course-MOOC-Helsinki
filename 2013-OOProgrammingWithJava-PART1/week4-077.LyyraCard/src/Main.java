
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code
        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);

        pekka.payGourmet();
        brian.payEconomical();

        System.out.println("Pekka: " + pekka);
        System.out.println("Brian " + brian);

        pekka.loadMoney(20);
        brian.payGourmet();

        System.out.println("Pekka: " + pekka);
        System.out.println("Brian " + brian);

        pekka.payEconomical();
        pekka.payEconomical();

        brian.loadMoney(50);

        System.out.println("Pekka: " + pekka);
        System.out.println("Brian " + brian);

    }
}
