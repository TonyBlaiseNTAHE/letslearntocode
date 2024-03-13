
package rw.gov.EmployeeMGT.view;

import java.util.Scanner;
import rw.gov.EmployeeMGT.dao.EmployeeDao;
import rw.gov.EmployeeMGT.model.Employee;

/**
 *
 * @author Tony Blaise NTAHE id = 23379
 */
public class App {
    public static void main(String[] args) {
        // variable declaration
        boolean condition = true;
        int empId;
        String empNames;
        Scanner sc = new Scanner(System.in);
        while(condition){
            System.out.println("=================");
            System.out.println("1. Register Employee");
            System.out.println("2. Register Employee By Prepared!");
            System.out.println("3. Delete an Empoyee");
            System.out.println("4. Update an employee!");
            System.out.println("0. Exit");
            System.out.println("------------");
            System.out.println("Choose: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter  Employee ID: ");
                    empId = sc.nextInt();
                    String numberToString = Integer.toString(empId);
                    while (numberToString.length() < 3)
                    {
                        System.out.println("Enter a number with more than three digit: ");
                        empId = sc.nextInt();
                        numberToString = Integer.toString(empId);
                    }
                    System.out.println("Enter Employee Name: ");
                    empNames = sc.next();
                    // calling model class
                    Employee emp = new Employee();
                    emp.setEmployeeId(empId);
                    emp.setEmployeeName(empNames);
                    
                    //calling DAO
                    EmployeeDao dao = new EmployeeDao();
                    dao.registerEmployee(emp);
                    condition = toContinue();
                    break;
                case  2:
                    System.out.println("Enter  Employee ID: ");
                    empId = sc.nextInt();
                    String numberToS = Integer.toString(empId);
                    while (numberToS.length() < 3)
                    {
                        System.out.println("Enter a number with more than three digit: ");
                        empId = sc.nextInt();
                        numberToS = Integer.toString(empId);
                    }
                    System.out.println("Enter Employee Name: ");
                    empNames = sc.next();
                    // calling model class
                    emp = new Employee();
                    emp.setEmployeeId(empId);
                    emp.setEmployeeName(empNames);
                    
                    //calling DAO
                    dao = new EmployeeDao();
                    dao.registerEmployeeByPreparedStatment(emp);
                    condition = toContinue();
                    break;
                case 3:
                    System.out.println("Enter Employee's ID");
                    empId = sc.nextInt();
                    
                    dao = new EmployeeDao();
                    dao.deleteEmployee(empId);
                    break;
                case 4:
                    System.out.println("Enter Employee's ID:");
                    empId = sc.nextInt();
                    System.out.println("Enter new Employee Name:");
                    String newEmpName = sc.next();
                    dao = new EmployeeDao();
                    dao.updateEmployee(empId, newEmpName);
                    condition = toContinue();
                    break;
                case 0:
                    System.out.println("Thank you for Using the System!");
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice!");
                    System.out.println("Enter Yes to continue or no to quit!");
                    String answer = sc.next();
                    if(answer.equalsIgnoreCase("yes")){
                        condition = true;
                    }else{
                        System.out.println("Thank you for using the system!");
                        condition = false;
                    }
            }
        }
    }
    
    private static boolean toContinue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yes to continue or no to quit!");
        String answer = sc.next();
        if(!answer.equalsIgnoreCase("yes")){
            return false;
        }
        return true;
    }
}
