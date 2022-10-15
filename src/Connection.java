import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.Statement;

public class Connection {

    public static java.sql.Statement getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet_java", "root", "6210");
            System.out.println("driver Connected");
            java.sql.Statement stat = con.createStatement();
            System.out.println("DataBase connected");
            con.close();
            return stat;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;

    }
}
