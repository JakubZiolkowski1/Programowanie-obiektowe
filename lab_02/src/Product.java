public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        // void powodował że konstruktor nie był tworzony poprawnie
        // program sie nie kompiluje bo nie wykrywa konstruktora z argumentami
        this.name = name;
        this.price = price;
        // rolą this jest odróżnienie pól na klasie od argumentów funkcji
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}
