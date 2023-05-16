import configuracion.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        MySqlConfig mysqlConfig = new MySqlConfig();

        try {
            Connection connection = mysqlConfig.getMysqlConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("La conexión a la base de datos es exitosa.");
                connection.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

}
