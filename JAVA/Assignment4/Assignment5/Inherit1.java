package Assignment5;

public class Inherit1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Johnny", "ntare", 200, 34);
        
        System.out.println("The Employee is " +employee.firstName +" "+employee.lastName);
        Employee.work();
        Employee.getSalary(employee.salary);
        
        System.out.println();

        HRManager hrManager = new HRManager("Alice", "Swith", 3000, 23);
        HRManager.work();
        HRManager.getSalary(hrManager.salary);
    }
}
