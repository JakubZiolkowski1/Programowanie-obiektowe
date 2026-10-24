public class Main {
    public static void main(String[] args) {
//        Samochod auto1 = new Samochod("Toyota", "Yaris", 250000);
//        Samochod auto2 = new Samochod("Audi", "A4", 2020, 42000);
//
//        auto1.uruchom();
//        System.out.println(auto1.marka);
//        System.out.println(auto1.model);
//        System.out.println(auto1.przebieg);
//        auto1.zwiekszPrzebieg(50000);
//        System.out.println(auto1.przebieg);
//        System.out.println(auto1.zwrocPrzebieg());
//
//        System.out.println(auto1.model == auto2.model);
//        System.out.println(auto1 == auto2);
//
//        Samochod auto3 = new Samochod("Toyota", "Yaris", 250000);
//        Samochod fail = null;
//        fail.uruchom();
//        System.out.println("");

        System.out.println("Zadanie 1");
        Dog dog1 = new Dog("pies", "Owczarek Niemiecki", 3);
        Dog dog2 = new Dog("Pies 2", "Dalmatyńczyk", 4);

        dog1.bark();
        dog2.bark();

        dog1.showInformation();
        dog2.showInformation();


        System.out.println("Zadanie 2");
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,4);
        System.out.println(point1.distance(point2));


        System.out.println("Zadanie 3");
        Book book1 = new Book("superbook", "superauthor", 2000);
        Book book2 = new Book("Ultrabook", "UltraAuthor");
        Book book3 = new Book();

        System.out.println("Zad 5");
        Car original = new Car("Toyota", "Yaris",2026, 250000);
        Car copy = new Car(original);

        copy.mileage += 100000;
        System.out.println(copy.mileage); // Kopia się zmienia
        System.out.println(original.mileage); // W oryginale zostaje
        // Dzieje sie tak dlatego ze sa to dwa oddzielne obiekty a nie referencja do tego samego


        System.out.println("Zadanie 6");
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";

        System.out.println(first.name);
        System.out.println(second.name);

        // Powstał jeden obiekt Person oraz dwie referencje do niego
        // Zmiana wykonana na second również działa na first bo obie te zmienne odnoszą sie do tego samego obiektu

        System.out.println("Zadanie 7");
        Person secondPerson = new Person(first);
        secondPerson.name = "Basia";

        System.out.println(first.name);
        System.out.println(secondPerson.name);

        System.out.println("Zadanie 8");
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increaseOther(counter2);
        System.out.println(counter2.value);
        // Metoda może zmienić stan innego obiektu bo dostała jego referencję jako argument a jego pola nie są prywatne

        System.out.println("Zadanie 9");
        Car car = null;
        if (car != null) {
            car.showInformation();
        }
    }
}