package principal;

import clase.Grafo;
import clase.Nodo;
import funcion.Entrada;

//Aqui se tiene que conectar las demás clases
public class Programa {
    public static void main(String[] args) 
    {
        Grafo grafo = new Grafo();

        int opcion = Entrada.opcionMultiple("¿Qué desea agregar?","Creación del Grafo", "Nodo,Arista,Terminar".split(","));

        switch (opcion) 
        {
            case 0: //Nodo
                grafo.agregar(crearNodo());
                break;

            case 1: //Arista
                

            
                
                break;
            case 2: //Terminar
            
                
                break;
        
            default: // Salir 
                break;
        }
        

    }

    public static Nodo crearNodo()
    {
        String nombreNodo = Entrada.pedirTexto("Ingrese el nombre del nodo:","Ingresar Nodo");
        return new Nodo(nombreNodo);
    }

    public static Nodo crearNodo(String enumeracionNodo, String completarTitulo)
    {
        String nombreNodo = Entrada.pedirTexto("Ingrese el nombre del " + enumeracionNodo + " nodo:","Ingresar Nodo " + completarTitulo);
        return new Nodo(nombreNodo);
    }
        
}
