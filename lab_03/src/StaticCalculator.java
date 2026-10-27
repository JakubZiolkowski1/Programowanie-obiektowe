public class StaticCalculator {
    private static int numberOfOperations;

    static int add(int a, int b) {
        numberOfOperations++;
        return a + b;
    }

    static int add(int a, int b, int c) {
        numberOfOperations++;
        return a + b + c;
    }

    static double add(double a, double b) {
        numberOfOperations++;
        return a + b;
    }

    static int subtract(int a, int b) {
        numberOfOperations++;
        return a - b;
    }

    static int multiply(int a, int b) {
        numberOfOperations++;
        return a * b;
    }

    static int getNumberOfOperations() {
        return numberOfOperations;
    }
}
