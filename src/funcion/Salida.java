package funcion;
import javax.swing.JOptionPane;
// aki se van a hacer las funciones para mostrar datos
// mediante JOptionPane

public class Salida {
    public static void Mensaje(String texto, String titulo)
    {    
        JOptionPane.showMessageDialog(null,texto,titulo,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void MensajeError(String texto, String titulo)
    {    
        JOptionPane.showMessageDialog(null,texto,titulo,JOptionPane.ERROR_MESSAGE);
    }
}
