package Assignment5;

public class HRManager {
    String firstName;
    String lastName;
    double salary;
    int EmpId;

    // class constructor
    public HRManager(String firstName, String lastName, double salary, int EmpId)
    {
        super();
    }
    @Override
    public static void work()
    {
        System.out.println("Starting at 9 am");
    }
    public static void getSalary(double salary)
    {
        System.out.println("the salary is " +salary);
    }

}
