/**
 * sample
 */
import java.util.Scanner; 

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        double average = 0;
        while (count < 3)
        {
            System.out.println("Enter the number: ");
            String input = scanner.nextLine();
            number = Integer.parseInt(input);
            average += number;
            count += 1;
        }
        average /= count; 
        System.out.println("The average is = " + average);


    }
}