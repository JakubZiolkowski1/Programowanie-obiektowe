public class Product {
    String name;
    double price;
    private static int numberOfProducts; // nie jest final bo bedzie sie zmieniac
    public static final int MAX_PRODUCTS = 5; // static bo licznik jest czescia klasy a nie konkretnych obiektow
    // final bo ta wartosc nie powinna sie zmieniac

    public Product(String name, double price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException();
        }
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    static int getNumberOfProducts(){
        return numberOfProducts;
    }
}
