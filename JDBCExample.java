import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;

public class JDBCExample {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

           
            String sql = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

           
            pstmt = conn.prepareStatement(sql);

           
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Jenny");
            pstmt.setInt(3, 25);
            pstmt.setBigDecimal(4, new BigDecimal("10000.00"));
            pstmt.addBatch();

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Jacky");
            pstmt.setInt(3, 30);
            pstmt.setBigDecimal(4, new BigDecimal("20000.00"));
            pstmt.addBatch();

            pstmt.setInt(1, 103);
            pstmt.setString(2, "Joe");
            pstmt.setInt(3, 20);
            pstmt.setBigDecimal(4, new BigDecimal("40000.00"));
            pstmt.addBatch();

            pstmt.setInt(1, 104);
            pstmt.setString(2, "John");
            pstmt.setInt(3, 40);
            pstmt.setBigDecimal(4, new BigDecimal("80000.00"));
            pstmt.addBatch();

            pstmt.setInt(1, 105);
            pstmt.setString(2, "Shameer");
            pstmt.setInt(3, 25);
            pstmt.setBigDecimal(4, new BigDecimal("90000.00"));
            pstmt.addBatch();

            
            int[] updateCounts = pstmt.executeBatch();

           
            System.out.println("Rows inserted: " + updateCounts.length);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
