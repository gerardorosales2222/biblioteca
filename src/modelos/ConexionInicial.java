package modelos;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConexionInicial {
    private Connection c;
    public Connection iniciarConexion(){
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos.");
        }
        return c;
    }
}
