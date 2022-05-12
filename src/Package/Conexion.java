package Package;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conexion = null;

    public static final String URL = "jdbc:postgresql://localhost/Final";
    public static final String user = "postgres";
    public static final String password = "2311";

    public Connection connectDB() {

        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la BD : " + e);
        }

        return conexion;

    }

}
