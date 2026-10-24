public class Samochod {
    // Pola
    String marka;
    String model;
    int rokProdukcji;
    double przebieg;

    public Samochod(String marka, String model, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public Samochod(String marka, String model, double przebieg) {
        this(marka, model, 2026, przebieg);
    }

    // metody klasowe
    public void uruchom(){
        System.out.println(this.marka + " " + this.model + " został uruchomiony");
    }

    public double zwrocPrzebieg(){
        return this.przebieg;
    }

    public void zwiekszPrzebieg(double value){
        if (value > 0) this.przebieg += value;
    }
}
