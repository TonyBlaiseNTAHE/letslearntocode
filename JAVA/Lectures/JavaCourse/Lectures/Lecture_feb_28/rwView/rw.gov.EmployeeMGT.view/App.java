public class App {
    public static void main(String[] args) {
           //
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
                System.out.print("Choose: ");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Employee ID: ");
                        break;
                    case 2:
                        System.out.println("Update an Employee");
                        break;
                    case 3:
                        System.out.println("Enter the id of the employee you want to delete: ");
                        break;
                    case 4:
                        System.out.println("Enter Employee ID: ");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 0:
                        System.out.println("Thank you for using the system");
                        condition = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
