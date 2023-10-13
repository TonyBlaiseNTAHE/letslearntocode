import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        getNum(input);
    }
    public static void getNum(String string)
    {
        int num = string.length();
        System.out.println("The number of character are: " +num);
    }
}
