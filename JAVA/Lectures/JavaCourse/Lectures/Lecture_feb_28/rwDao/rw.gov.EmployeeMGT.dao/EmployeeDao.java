import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDao {
    
    final String URL = "jdbc:mysql://localhost:3306/Employee";
    final String username = "root";
    final String password = "%***";
    //CRUD Operation
    // Create Operation
    public void registerEmployee(Employee empObj) {
        // try and catch
        try {
            // create connection
        Connection con = DriverManager.getConnection(URL, username, password);
        // create statement
        Statement st = con.createStatement();
        String sql = "INSERT INTO employee (emp_id, emp_names) values(?, ?, ?, ?)";
        int rowAffected = st.executeUpdate(sql);
        if (rowAffected > 0) {
            System.out.println("success");
        } else {
            System.out.println("Fail");
        }
        con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
