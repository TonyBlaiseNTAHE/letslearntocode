import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int i = 0;
        double average = 0;
        int number;
        while (i < 3)
        {
            System.out.println("Enter a number: ");
            String input = scanner.nextLine();
            number = Integer.parseInt(input);
            average += number;
            i++; 
        }
        average = average / i;
        System.out.println("The average is = " + average); 
        scanner.close();

    }
}
