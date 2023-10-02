import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String nameString = scanner.nextLine();
        System.out.println("Enter you age: ");
        String ageString = scanner.nextLine();
        System.out.println("Enter you semester: ");
        String semString = scanner.nextLine();
        System.out.print("your name is " +nameString);
        System.out.print(" and your age is " +ageString);
        System.out.println(" and you are in semester " +semString);
    }
}
