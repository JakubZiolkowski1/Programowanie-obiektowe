public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
    }

    public void incrementAge(){
        this.age++;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }
}
