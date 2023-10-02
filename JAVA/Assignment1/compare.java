import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.irn);
        System.out.println("Enter the first marks: ");
        String input1 = scanner.nextLine();
        int mark1 = Integer.parseInt(input1);
        System.out.println("Enter the second marks: ");
        String input2 = scanner.nextLine();
        int mark2 = Integer.parseInt(input2);
        int total  = mark1 + mark2;
        if (total > 90) {
            System.out.println("The student is excellent");
        } else {
            System.out.println("The student is good");
        }
    }
}

