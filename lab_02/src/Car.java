public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }

    void drive(double distance) {
        if (mileage > 0) this.mileage += distance;
    }

    void showInformation(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.productionYear);
        System.out.println(this.mileage);
    }
}
