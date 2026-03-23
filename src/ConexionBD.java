import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/tres_en_raya";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConexion() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
