public class Zad10 {
    public static void main(String[] args) {
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        // a: 10
        // b: 10
        // c: 10

        b.value = 20;
        c.value = 30;

        // a: 20
        // b: 20
        // c: 30

        System.out.println(a.value); // 20
        System.out.println(b.value); // 20
        System.out.println(c.value); // 30

        System.out.println(a == b); // true
        System.out.println(a == c); // false
    }
}
