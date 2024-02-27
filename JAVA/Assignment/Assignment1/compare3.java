import java.util.Scanner;
public class compare3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        String input1 = scanner.nextLine();
        int a = Integer.parseInt(input1);

        System.out.println("Enter the second number: ");
        String input2 = scanner.nextLine();
        int b = Integer.parseInt(input2);

        System.out.println("Enter the third number: ");
        String input3 = scanner.nextLine();
        int c = Integer.parseInt(input3);

        // Consume the remaining newline character
        scanner.nextLine();

        if (a > b) {
            if (a >= c) {
                if (a == c)
                    System.out.println("a and c are equal");
                else
                    System.out.println("A is the maximum");
            }
        } else if (a == b) {
            System.out.println("a and b are equal");
        } else if (a == b && b == c) {
            System.out.println("a and b and c are equal");
        } else if (b > a) {
            if (b >= c) {
                if (b == c)
                    System.out.println("b and c are equal");
                else
                    System.out.println("B is the maximum");
            }
        } else {
            System.out.println("C is greater");
        }
    }
}
