package daily.dose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class DbConnect {

    public static Connection getconnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dailyDose", "root", "root");

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }

}
