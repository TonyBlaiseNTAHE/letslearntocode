package Assignment5;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        Triangle t = new Triangle( 4, 4, 5);
         

        System.out.println("The area of the circle is " + c.calculateArea());
        System.out.println("The perimeter of the circle is " + c.calculatePerimeter());
        System.out.println("The area of the Triangle is " + t.calculateArea());
        System.out.println("The perimeter of the Triangle is " + t.calculatePerimeter());
    }
}
