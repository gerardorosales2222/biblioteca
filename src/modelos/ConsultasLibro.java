package modelos;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultasLibro {
    
    private ConexionInicial inicial = new ConexionInicial();
    private Connection miConexion = null;
    private PreparedStatement ps;
    
    public void guardarLibro(Libro l){
        miConexion = inicial.iniciarConexion();
        try {
              ps = miConexion.prepareStatement("INSERT INTO `libros`(`idLibro`, `nombreLibro`, `ISBN`, `Editorial`, `anio`) VALUES ('0',?,?,?,?)");
              ps.setString(1, l.getNombre());
              ps.setString(2, l.getISBN());
              ps.setInt(3, l.getEditorial());
              ps.setInt(4,l.getAnio());
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Guardado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar");
            System.out.println(ps);
        }
      
    }
}
