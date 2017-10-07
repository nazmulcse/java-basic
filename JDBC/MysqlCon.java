import java.sql.*;
public class MysqlCon{
    public static void main(String[] args){
        try{

            Class.forName("com.mysql.jdbc.Driver"); // Load mysql driver
            Connection con = DriverManager.getConnection(   // Creating connection
                "jdbc:mysql://localhost:3306/blog", "root", "222222"
            );
            Statement stmt = con.createStatement();     // Creating statement
            ResultSet rs = stmt.executeQuery("select * from divisions");    // Execute query with statement
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
