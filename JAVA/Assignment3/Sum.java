import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int sum = SumOfDigit(number);
        System.out.println("the sum of all digits is: " +sum);
    }
    public static int SumOfDigit(int n)
    {
        int sum = 0;
        int j;
        while(n != 0)
        {
            j = n % 10;
            n /= 10;
            sum += j;
        }
        return sum;
    }
}
