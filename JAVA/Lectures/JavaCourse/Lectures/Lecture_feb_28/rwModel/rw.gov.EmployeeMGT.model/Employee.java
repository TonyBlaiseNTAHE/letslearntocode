public class Employee {

    private int empId;
    private string empName;

    public Employee(int empId, string empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public int getEmployeeId(int empid) {
        return this.empId;
    }
    public string getEmployeeName(string empName) {
        return this.empName;
    }
    public void setEmployeeId(int empId) {
        this.empId = empId;
    }
    public void setEmployeeName(string empName) {
        this.empName = empName;
    }
}