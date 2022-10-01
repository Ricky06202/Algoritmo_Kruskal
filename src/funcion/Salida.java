package funcion;
import javax.swing.JOptionPane;
// aki se van a hacer las funciones para mostrar datos
// mediante JOptionPane

public class Salida {

    public static void Mensaje(String Texto, String Titulo)
    {    
        JOptionPane.showMessageDialog(null,Texto,Titulo,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
