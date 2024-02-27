import java.sql.*;

public class App {
    static final String DB_URL = "jdbc:mysql://localhost:3306/SCHOOL";
    static final String USER = "root";
    static final String PASS = "%password%";
    static final String QUERY = "SELECT * FROM Student WHERE name like 'J%'";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String courses = rs.getString("courses");
                
                // Print the data
                System.out.println("ID: " + id + ", Name: " + name + ", courses: " + courses);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }   
    }
}