public class Zad5 {

    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
        }

        // i: 0
        // wynik: 2
        // x: 4

        // i: 1
        // wynik 6
        // x: 8

        // i: 2
        // wynik: 14
        // x: 16

        // i: 3
        // wynik: 30
        // x: 32

        System.out.println(x);
        System.out.println(wynik);
    }
}