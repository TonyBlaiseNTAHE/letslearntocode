package GEO;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(2);
        Triangle t = new Triangle(1, 2, 3);

        s.calculateArea();
        s.calculatePerimeter();
        t.calculateArea();
        t.calculatePerimeter();
    }
}
