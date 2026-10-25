
public class Main {
    public static void main(String[] args) {
        Person person = new Person("asd", 123, "asd@");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getEmail());

        BankAccount bankAccount = new BankAccount("ja", 0);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(200);
        System.out.println(bankAccount.getBalance());

        int[] results = {12, 23, 99, 43};

        ExamResults examResults = new ExamResults(results);

        results[0] = 10000;

        examResults.getPoints()[0] = 20000;

        System.out.println("Results");
        for (int i = 0; i < examResults.getPoints().length; i++) {
            System.out.println(examResults.getPoints()[i]);
        }

        System.out.println("Zad 5");
        System.out.println(Product.getNumberOfProducts()); // 0

        Product product = new Product("produkt", 10);
        System.out.println(Product.getNumberOfProducts()); // 1

        for (int i = 0; i < 4; i++) {
            new Product("produkt", 10);
        }

        System.out.println(Product.getNumberOfProducts());
        new Product("produkt", 10); // IllegalStateException


    }
}