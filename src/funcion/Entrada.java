package funcion;
import javax.swing.JOptionPane;
// aki se van a hacer las funciones para ingresar datos
// mediante JOptionPane

public class Entrada {
    public static String pedirTexto(String texto, String titulo)
    {    
        while (true) {
            String valString = JOptionPane.showInputDialog(null,texto, titulo, JOptionPane.INFORMATION_MESSAGE);
            if(valString != null && !valString.trim().equals(""))
                return valString.trim();     
            Salida.MensajeError("ERROR, NO PUEDE DEJAR EL CAMPO VACIO", "ERROR CAMPO VACIO");
        }
    }

    public static float pedirNumero(String texto, String titulo)
    {   
        while (true) {
            String valFloat = pedirTexto(texto, titulo);
            try {
                return Float.parseFloat(valFloat);     
            } catch (Exception e) {
                Salida.MensajeError("ERROR, EL NUMERO INGRESADO ES INVALIDO", "ERROR NUMERO INVALIDO");
            }
        } 
    }

    //positivos son los mayores a 0
    public static float pedirNumeroPositivo(String texto, String titulo)
    {   
        while (true) {
            float valFloat = pedirNumero(texto, titulo);
            if(valFloat > 0)
                return valFloat;
            Salida.MensajeError("ERROR, EL NUMERO INGRESADO NO ES POSITIVO", "ERROR NUMERO NO POSITIVO"); 
        } 
    }

    public static int opcionMultiple(String mensaje, String titulo, Object[] opciones){
        int valor = JOptionPane.showOptionDialog(null, mensaje, titulo, 0, 1, null, opciones, null);
        return valor;
    }

    public static int opcionSiNo(String mensaje, String titulo){
        while (true) {
            int valor = JOptionPane.showOptionDialog(null, mensaje, titulo, 0, 1, null, "Si, No".split(", "), null);
            if(valor != -1)
                return valor; // 0 = Si, 1 = No, -1 = Cerrar la ventana
            Salida.MensajeError("ERROR, DEBE ELEGIR UNA DE LAS OPCIONES", "ERROR OPCION INVALIDA");
        }
    }

}
