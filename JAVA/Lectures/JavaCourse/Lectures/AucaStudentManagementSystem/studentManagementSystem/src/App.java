import java.sql.*;

public class App {
    static final String DB_URL = "jdbc:mysql://localhost:3306/hbtn_0e_6_usa";
    static final String USER = "root";
    static final String PASS = "9197";
    static final String QUERY = "SELECT * FROM states";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            // Extract data from result set
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
