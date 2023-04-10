package progitetelek;

public class tetelek {

    public static void main(String[] args) {
        indit();
    }

    public static void indit() {
        //tömbök
        int maxmin[] = {-1, 2, 3, 4, 5, 6, 7, 8, -9, 0};
        int osszead[] = {1, 2, 3, 100};

        System.out.println("___A tömbböl való számok keresése___");
        //kiválaszt
        System.out.println("Tétel: Maximum kiválasztás: ");
        maximum(maxmin);
        System.out.println("Tétel: Minimum kiválasztás: ");
        minimum(maxmin);
        System.out.println("Tétel: Eldöntés: ");
        eldontes(maxmin, -1);
        System.out.println("Tétel: Kiválasztás: ");
        kivalasztas(maxmin, 6);
        System.out.println("Tétel: Keresés: ");
        kereses(maxmin, -10);
        System.out.println(" ");
        System.out.println("___A tömbböl való számok megszámolása/kiszámolása___");
        //osszead,megszámól
        System.out.println("Tétel: Összegzés: ");
        osszegzes(osszead);
        System.out.println("Tétel: Megszámlálás: ");
        megszamlalas(osszead);
    }

    private static void maximum(int szamok[]) {
        int max = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        System.out.printf("Legnagyobb szám a tömbben: " + max + ". ");
        System.out.println(" ");
    }

    private static void minimum(int szamok[]) {
        int min = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        System.out.printf("Legkisebb szám a tömbben: " + min + ". ");
        System.out.println(" ");
    }

    private static void osszegzes(int szamok[]) {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg = osszeg + szamok[i];
        }
        System.out.printf("A számok összege: " + osszeg + ". ");
        System.out.println(" ");
    }

    private static void megszamlalas(int szamok[]) {
        int db = 1;

        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < 5) {
                db++;
            }
        }
        System.out.printf("Összesen ennyi szám van: " + db + ". ");
        System.out.println(" ");
    }

    private static void eldontes(int szamok[], int ker) {
        boolean van = false;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] == ker) {
                van = true;
            }
        }
        System.out.printf("Van-e " + ker + " a tömbben: " + van + ". ");
        System.out.println(" ");
    }

    private static void kivalasztas(int szamok[], int ker) {
        int i = 0;
        while (szamok[i] != ker) {
            i++;
        }
        System.out.printf("A(z) " + ker + " szám indexe: " + i + ".");
        System.out.println(" ");
    }

    private static void kereses(int szamok[], int ker) {
        int i = 0;
        while (i < szamok.length && szamok[i] != ker) {
            i++;
        }

        if (i < szamok.length) {
            System.out.printf("Indexe: " + i + ".");
            System.out.println(" ");
        } else {
            System.out.printf("Nincs benne.");
            System.out.println(" ");
        }
    }

}
