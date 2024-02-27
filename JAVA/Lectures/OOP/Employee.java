package Lectures;
import java.time.Year;
public class Employee {
    String fname;
    String lname;
    int employee_id;
    double salary;
    Year dateOfEmployment = Year.of(2024);
    String title;

    public Employee(String fname, String lname, int employee_id, Year dateOfEmployment, String title)
    {
        this.fname  =fname;
        this.lname = lname;
        this.employee_id = employee_id;
        this.dateOfEmployment = dateOfEmployment;
        this.title = title;
    }
    public void displayEmployee()
    {
        Year dateOfFirstJob = Year.of(2022);
        int result = dateOfEmployment.compareTo(dateOfFirstJob);
        String position= "Manager"; 
        if (title == position && result >= 1)
        {
            System.out.println("the employee is "+fname +" "+lname+ "and has " +result+"years of experience");
        }
    }

}
