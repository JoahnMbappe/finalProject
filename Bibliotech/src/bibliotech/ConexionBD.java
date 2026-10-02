package bibliotech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/bibliotech";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "root";

    public static Connection conectar() {

        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexion exitosa con la base de datos BiblioTech.");

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            System.out.println("Mensaje: " + e.getMessage());
        }

        return conexion;
    }
}
