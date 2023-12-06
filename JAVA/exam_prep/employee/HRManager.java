package employee;

import java.util.List;

public class HRManager extends Employee{

    private List<String> employees;

    public HRManager(String lastName, String firstName, int salary, int empID)
    {
        super(lastName, firstName, empID, salary);
    }
    public void addEmployee(String employeeName){
        employees.add(employeeName);
        System.out.println(employeeName + " has been added as an employee");
    }
    @Override
    public void work()
    {
        System.out.println("start working at 9am");
    }
}
