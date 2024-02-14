package Introduction;

import java.util.Scanner;

public class EmployeeMGTSystem {
    public static void main(String[] args) {
        // declaration and initialization
        boolean condition = true;

        while (condition) {
            System.out.println("*******************");
            System.out.println("EMPLOYEE MGT SYSTEM");
            System.out.println("*******************");
            System.out.println("1. Register an Employee");
            System.out.println("2. Update an Employee");
            System.out.println("3. Delete an Employee");
            System.out.println("4. Find Employee By Id");
            System.out.println("5. Retrieve All Employee");
            System.out.println("0. Exit");
            System.out.print("choose: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Register Employee Selected");
                    break;
                case 2:
                    System.out.println("Update an Employee");
                    break;
                case 3:
                    System.out.println("Delete an Employee");
                    break;
                case 0:
                    System.out.println("Thank you for using the system");
                    System.exit(-1);
                    break;
                default:
                    break;
            }
        }
    }
}
