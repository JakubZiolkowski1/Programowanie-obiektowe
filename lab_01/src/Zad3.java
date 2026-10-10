import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Liczba nr " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }

        double avg = (double) sum / 10;

        int aboveAvgCount = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > avg) {
                aboveAvgCount++;
            }
        }

        System.out.println("Najwieksza wartosc: " + max);
        System.out.println("Najmniejsza wartosc: " + min);
        System.out.println("Suma: " + sum);
        System.out.println("Srednia arytmetyczna: " + avg);
        System.out.println("Wiekszych od sredniej: " + aboveAvgCount);
    }
}
