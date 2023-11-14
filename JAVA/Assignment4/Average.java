import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the thrid number: ");
        double num3 = Double.parseDouble(scanner.nextLine());

        double result = calculate(num1, num2, num3);
        print(result);

    }
    public static double calculate(double num1, double num2, double num3)
    {
        double Average =  (num1 + num2 + num3) / 3;
        return Average;
    }
    public static void print(double result)
    {
        System.out.println("The Average is " +result);
    }

}
