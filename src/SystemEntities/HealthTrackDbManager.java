package SystemEntities;
import java.sql.*;
public class HealthTrackDbManager {

    public static Connection getConnection(){
        Connection connection = null;
        try{
            String path = "jdbc:oracle:thin:@172.16.30.128:1521:xe";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(path, "system", "hahaha123");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return  connection;
    }

}
