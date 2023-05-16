package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MySqlConfig {
    public String host = "localhost";
    public String port = "3306";
    public String user = "root";
    public String pass = "root";
    public String db = "develop";
    public String classDriver = "com.mysql.cj.jdbc.Driver";

    public Connection getMysqlConnection() throws ClassNotFoundException, SQLException{
        Class.forName(classDriver);
        String url = "jdbc:mysql://"+host+"/"+db+"?user="+user+"&password="+pass;
        return DriverManager.getConnection(url);
    }


}
