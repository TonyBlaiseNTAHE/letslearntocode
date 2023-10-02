import java.util.Scanner;
import java.util.concurrent;
public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the OOP max: ");

        String input1 = scanner.nextLine();
        int course1 = Integer.parseInt(input1);
        
        System.out.println("Enter the Os max: ");
        
        String input2 = scanner.nextLine();
        int course2 = Integer.parseInt(input2);
        
        System.out.println("Enter the DBMS max: ");
        
        String input3 = scanner.nextLine();
        int course3 = Integer.parseInt(input3);

        int total  = course1 + course2 + course3;
        
        if (total < 300 && total > 200)
        {
            System.out.println("Excellent");
        }
        else if (total < 200 && total > 150)
        {
            System.out.println("very good");
        }
        else if (total < 150 && total > 100)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
