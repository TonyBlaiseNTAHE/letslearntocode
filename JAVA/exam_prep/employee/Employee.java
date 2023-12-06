package employee;

public class Employee {
    protected String lastName;
    protected String firstName;
    protected int empID;
    protected int salary;

    public Employee(String lastName, String firstName, int empID, int salary)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.empID = empID;
        this.salary = salary;
    }

    /*getters and setters of the names */
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public int setSalary(int salary)
    {
        return salary;
    }
    public String greeting(String lastName)
    {
        return "Hi iam " + lastName;
    }
    public void getSalary(int salary)
    {
        System.out.println("he's salary is "+ salary);
    }
    public void work()
    {
        System.out.println("Start working at 9am");
    }
}
