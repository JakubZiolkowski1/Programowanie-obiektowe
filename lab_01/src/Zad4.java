import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Brak srednika

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // = zamiast ==
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // Brak srednika
        }

        for (int i = 0; i <= 5; i++) { // -- zamiast ++ powodowal nieskonczona petle
            System.out.println(i);
        }

        scanner.close();
    }
}