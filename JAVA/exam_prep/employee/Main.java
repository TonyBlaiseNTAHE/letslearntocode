package employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Tony", "NTAHE", 1, 2000000);
        HRManager m = new HRManager("abavandimwe", "sapiens", 2200000, 3);
        m.addEmployee("joe doe");
        System.out.println("the employees are " +m.addEmployee());
        System.out.println(m);
    }
}
