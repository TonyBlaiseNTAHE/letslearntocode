package Bird;

public class Main {
    public static void main(String[] args) {
        Eagle e = new Eagle("gray");
        Hawk h = new Hawk("White");

        e.makeSound();
        h.makeSound();
        e.fly();
        h.fly();
    }
}
