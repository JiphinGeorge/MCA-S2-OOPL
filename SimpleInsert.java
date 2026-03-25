import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SimpleInsert {
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver (needed for ojdbc8)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Step 2: Connection
            String url = "jdbc:oracle:thin:@//localhost:1521/XE";
            String username = "system";   // or sys (if configured)
            String password = "manager";

            Connection con = DriverManager.getConnection(url, username, password);

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Insert Query
            String query = "INSERT INTO student VALUES (3, 'Alex', 20)";
            int rows = stmt.executeUpdate(query);

            // Step 5: Output
            System.out.println(rows + " row inserted successfully ✅");

            // Step 6: Close
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}