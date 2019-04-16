import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next())
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getInt(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}