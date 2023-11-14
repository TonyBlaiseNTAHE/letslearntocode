package Assignment5;

public class Employee {
    String firstName;
    String lastName;
    double salary;
    int EmpId;

    // class constructor
    public  Employee(String firstName, String lastName, int salary, int EmpId)
    {
        this.EmpId = EmpId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    // class methods
    public static void work()
    {
        System.out.println("Start at 8am");
    }

    public static void getSalary(double salary)
    {
        System.out.println("Salary is " + salary);

    }
}
