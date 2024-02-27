import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        getSum(input);
    }
    public static void getSum(String str)
    {
        int sum = 0;
        for (int i = 0 ; i < str.length(); i++)
        {
            char digit = str.charAt(i);
            int num = Character.getNumericValue(digit);
            sum += num;
        }
        System.out.println("the sum is " +sum);;
    }
}
