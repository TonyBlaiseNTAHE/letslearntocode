import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        double area;
        double perimeter;
        double length, width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length: ");
        String input = scanner.nextLine();
        length = Double.parseDouble(input);

        System.out.println("Enter the width: ");
        input = scanner.nextLine();
        width = Double.parseDouble(input);

        area = length  * width;
        perimeter = 2 * (length + width);

        System.out.println("The Area is "+ area);
        System.out.println("The perimeter is " + perimeter);
        scanner.close();
    }
}