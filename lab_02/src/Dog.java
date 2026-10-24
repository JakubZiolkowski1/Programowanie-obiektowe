public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    void bark(){
        System.out.println("Wow Wow");
    }

    void showInformation(){
        System.out.println(this.name);
        System.out.println(this.breed);
        System.out.println(this.age);
    }
}
