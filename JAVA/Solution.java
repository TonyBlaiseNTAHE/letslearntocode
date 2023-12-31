import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();
        System.out.print("Enter a double: ");
        double num2 = scanner.nextDouble();

        System.out.println("String: " + inputString);
        System.out.println("Int: "+num);
        System.out.println("Double: "+num2);
    }
}
