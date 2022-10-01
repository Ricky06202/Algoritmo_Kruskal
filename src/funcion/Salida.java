package funcion;
import javax.swing.JOptionPane;
// aki se van a hacer las funciones para mostrar datos
// mediante JOptionPane

public class Salida {
    public static void mensaje(String texto, String titulo)
    {    
        JOptionPane.showMessageDialog(null,texto,titulo,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mensajeError(String texto, String titulo)
    {    
        JOptionPane.showMessageDialog(null,texto,titulo,JOptionPane.ERROR_MESSAGE);
    }
}
