public class User {

    private final String login;
    private String password;
    private int age; // Pole powinno być instancyjne

    public User(
            String login,
            String password,
            int age
    ) {
        this.login = login;
        this.password = password;
//        this.age = age; // ustawienie pola age powinno byc dla instancji
        setAge(age);
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public boolean passwordMatch(String password){
        return this.password.equals(password);
    }

    public void showUser() {// Metoda nie moze byc statyczna
        // blad kompilacji przez probe uzyskania pola ktore nie istnieje na klasie
        System.out.println(
                "Login: " + login
                        + ", wiek: " + age
        );
    }
}