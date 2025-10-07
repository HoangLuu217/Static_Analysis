import java.sql.*;

public class UserService {
    public String getUserNameById(int id, Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        // 
        String sql = "SELECT name FROM Users WHERE id = " + id;  
        ResultSet rs = stmt.executeQuery(sql);

        // 
        return rs.getString("name");
    }
}
