package progitetelek;

public class tetelek {

    public static void main(String[] args) {
        indit();
    }

    public static void indit() {
        //tömbök
        int maxmin[] = {-1, 2, 3, 4, 5, 6, 7, 8, -9, 0};
        int osszead[] = {1, 2, 3, 100};

        ugorKiir("___A tömbböl való számok keresése___");
        //kiválaszt
        ugorKiir("Tétel: Maximum kiválasztás: ");
        maximum(maxmin);
        ugorKiir("Tétel: Minimum kiválasztás: ");
        minimum(maxmin);
        ugorKiir("Tétel: Eldöntés: ");
        eldontes(maxmin, -1);
        ugorKiir("Tétel: Kiválasztás: ");
        kivalasztas(maxmin, 6);
        ugorKiir("Tétel: Keresés: ");
        kereses(maxmin, -10);
        ugorKiir(" ");
        ugorKiir("___A tömbböl való számok megszámolása/kiszámolása___");
        //osszead,megszámól
        ugorKiir("Tétel: Összegzés: ");
        osszegzes(osszead);
        ugorKiir("Tétel: Megszámlálás: ");
        megszamlalas(osszead);
    }

    private static void maximum(int szamok[]) {
        int max = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        sorKiir("Legnagyobb szám a tömbben: " + max + ". ");
        ugorKiir(" ");
    }

    private static void minimum(int szamok[]) {
        int min = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        sorKiir("Legkisebb szám a tömbben: " + min + ". ");
        ugorKiir(" ");
    }

    private static void osszegzes(int szamok[]) {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg = osszeg + szamok[i];
        }
        sorKiir("A számok összege: " + osszeg + ". ");
        ugorKiir(" ");
    }

    private static void megszamlalas(int szamok[]) {
        int db = 1;

        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < 5) {
                db++;
            }
        }
        sorKiir("Összesen ennyi szám van: " + db + ". ");
        ugorKiir(" ");
    }

    private static void eldontes(int szamok[], int ker) {
        boolean van = false;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] == ker) {
                van = true;
            }
        }
        sorKiir("Van-e " + ker + " a tömbben: " + van + ". ");
        ugorKiir(" ");
    }

    private static void kivalasztas(int szamok[], int ker) {
        int i = 0;
        while (szamok[i] != ker) {
            i++;
        }
        sorKiir("A(z) " + ker + " szám indexe: " + i + ".");
        ugorKiir(" ");
    }

    private static void kereses(int szamok[], int ker) {
        int i = 0;
        while (i < szamok.length && szamok[i] != ker) {
            i++;
        }

        if (i < szamok.length) {
            System.out.printf("Indexe: " + i + ".");
            ugorKiir(" ");
        } else {
            sorKiir("Nincs benne.");
            ugorKiir(" ");
        }
    }

    private static void sorKiir(String str) {
        System.out.printf(str);
    }

    private static void ugorKiir(String str) {
        System.out.println(str);
    }
}
