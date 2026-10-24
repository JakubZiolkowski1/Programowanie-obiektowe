public class Person {
    String name;

    public void introduceYourself(){
        System.out.println("I am " + this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other){
        this.name = other.name;
    }
}
