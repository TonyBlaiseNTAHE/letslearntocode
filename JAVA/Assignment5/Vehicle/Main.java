package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car b = new Car("benz");
        Motorcycle m = new Motorcycle("Yonda");

        b.startEngine();
        m.stopEngine();
    }
}
