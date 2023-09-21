package modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionInicial {
    private Connection c;
    public Connection iniciarConexion(){
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost/Biblioteca", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos.");
        }
        return c;
    }
}
