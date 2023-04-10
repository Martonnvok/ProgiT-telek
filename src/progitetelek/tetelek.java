package progitetelek;

public class tetelek {

    public static void main(String[] args) {
        //tömbök
        int maxmin[] = {-1, 2, 3, 4, 5, 6, 7, 8, -9, 0};
        int osszead[]={1,2,3};
        
        //kiválaszt
        maximum(maxmin);
        minimum(maxmin);
        
        //osszead,megszámól
        osszegzes(osszead);
    }

    public static void maximum(int szamok[]) {
        int max = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        System.out.printf("Legnagyobb szám a tömbben: " + max + ". ");
        System.out.println(" ");
    }

    public static void minimum(int szamok[]) {
        int min = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        System.out.printf("Legkisebb szám a tömbben: " + min + ". ");
        System.out.println(" ");
    }

    public static void osszegzes(int szamok[]) {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg = osszeg + szamok[i];
        }
        System.out.printf("A számok összege: " + osszeg + ". ");
        System.out.println(" ");
    }

    public static void megszamlalas(int szamok[]) {
        int min = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        System.out.printf("Legkisebb szám a tömbben: " + min + " ");
        System.out.println(" ");
    }

}
