package progitetelek;

import java.io.PrintStream;
import static java.nio.charset.StandardCharsets.UTF_8;

public class tetelek {

    public static PrintStream out = new PrintStream(System.out, true, UTF_8);

    public static void main(String[] args) {
        indit();
    }

    public static void indit() {
        //tömbök
        int maxmin[] = {-1, 2, 3, 4, 5, 6, 7, 8, -9, 0};
        int osszead[] = {1, 2, 3, 100};
        elvalasztoVonal();
        ugorKiir("/___A tömbböl való számok keresése___/");
        //kiválaszt
        ugorKiir(" ");
        ugorKiir("Tétel: Maximum kiválasztás: ");
        maximum(maxmin);
        ugorKiir(" ");
        ugorKiir("Tétel: Minimum kiválasztás: ");
        minimum(maxmin);
        ugorKiir(" ");
        ugorKiir("Tétel: Eldöntés: ");
        eldontes(maxmin, -1);
        ugorKiir(" ");
        ugorKiir("Tétel: Kiválasztás: ");
        kivalasztas(maxmin, 6);
        ugorKiir(" ");
        ugorKiir("Tétel: Keresés: ");
        kereses(maxmin, -10);
        elvalasztoVonal();
        ugorKiir(" ");
        elvalasztoVonal();

        //osszead,megszámól
        ugorKiir("/___A tömbböl való számok megszámolása/kiszámolása___/");
        ugorKiir(" ");
        ugorKiir("Tétel: Összegzés: ");
        osszegzes(osszead);
        ugorKiir(" ");
        ugorKiir("Tétel: Megszámlálás: ");
        megszamlalas(osszead);
        elvalasztoVonal();
    }

    private static void maximum(int szamok[]) {
        int max = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        sorKiir("\tLegnagyobb szám a tömbben: " + max + ". ");
        ugorKiir(" ");
    }

    private static void minimum(int szamok[]) {
        int min = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        sorKiir("\tLegkisebb szám a tömbben: " + min + ". ");
        ugorKiir(" ");
    }

    private static void osszegzes(int szamok[]) {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg = osszeg + szamok[i];
        }
        sorKiir("\tA számok összege: " + osszeg + ". ");
        ugorKiir(" ");
    }

    private static void megszamlalas(int szamok[]) {
        int db = 1;

        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < 5) {
                db++;
            }
        }
        sorKiir("\tÖsszesen ennyi szám van: " + db + ". ");
        ugorKiir(" ");
    }

    private static void eldontes(int szamok[], int ker) {
        boolean van = false;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] == ker) {
                van = true;
            }
        }
        sorKiir("\tVan-e " + ker + " a tömbben: " + van + ". ");
        ugorKiir(" ");
    }

    private static void kivalasztas(int szamok[], int ker) {
        int i = 0;
        while (szamok[i] != ker) {
            i++;
        }
        sorKiir("\tA(z) " + ker + " szám indexe: " + i + ".");
        ugorKiir(" ");
    }

    private static void kereses(int szamok[], int ker) {
        int i = 0;
        while (i < szamok.length && szamok[i] != ker) {
            i++;
        }

        if (i < szamok.length) {
            System.out.printf("\tIndexe: " + i + ".");
            ugorKiir(" ");
        } else {
            sorKiir("\tNincs benne.");
            ugorKiir(" ");
        }
    }

    private static void sorKiir(String str) {

        out.printf(str);
    }

    private static void ugorKiir(String str) {
        out.println(str);
    }

    private static void elvalasztoVonal() {

        for (int i = 0; i < 19; i++) {
            sorKiir("===");
        }
        ugorKiir(" ");

    }
}
