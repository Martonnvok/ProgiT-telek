package progitetelek;

public class tetelek {

    public static void main(String[] args) {
        int szamok[] = {-1, 2, 3, 4, 5, 6, 7, 8, -9, 0};
        maximum(szamok);
        minimum(szamok);
    }

    public static void maximum(int szamok[]) {
        int max = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        System.out.printf("Legnagyobb szám a tömbben: " + max+" ");
        System.out.println(" ");
    }
    
    public static void minimum(int szamok[]) {
        int min = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        System.out.printf("Legkisebb szám a tömbben: " + min+" ");
    }
}
