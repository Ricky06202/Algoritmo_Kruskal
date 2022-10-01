package funcion;
import javax.swing.JOptionPane;
// aki se van a hacer las funciones para recibir datos
// mediante JOptionPane

public class Entrada {
    public static float pedirFloat(String Texto, String Titulo )
    {    
        String valFloat =  JOptionPane.showInputDialog(null,Texto, Titulo, JOptionPane.INFORMATION_MESSAGE);
        return Float.parseFloat(valFloat);     

    }
    public static String pedirString(String Texto, String Titulo )
    {    
        String valString =  JOptionPane.showInputDialog(null,Texto, Titulo, JOptionPane.INFORMATION_MESSAGE);
        return valString;     

    }
    
}
