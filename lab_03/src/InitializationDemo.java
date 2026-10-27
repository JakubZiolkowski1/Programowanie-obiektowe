public class InitializationDemo {

    // Statyczne pole
    public static String staticField;

    // Pole instancji
    public String instanceField;

    // Blok statyczny
    static {
        System.out.println("Blok statyczny");
    }

    // Blok instancyjny
    {
        System.out.println("Blok instancyjny");
    }

    public InitializationDemo(String instanceField){
        System.out.println("Konstruktor");
        this.instanceField = instanceField;
    }
}
