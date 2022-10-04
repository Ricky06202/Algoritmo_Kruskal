package principal;

import clase.Arista;
import clase.Grafo;
import clase.Nodo;
import funcion.Entrada;

//Aqui se tiene que conectar las demás clases
public class Programa {
    public static void main(String[] args) 
    {
        algoritmoDeKruskal();
    }

    private static void algoritmoDeKruskal() {
        while (true) {
            Grafo grafo = new Grafo();
            int opcion = elegirOpcion();
            realizarAccion(grafo, opcion);
        }
    }

    private static int elegirOpcion() {
        return Entrada.opcionMultiple("¿Qué desea agregar?","Creación del Grafo", "Nodo,Arista,Terminar".split(","));
    }

    private static void realizarAccion(Grafo grafo, int opcion) {
        switch (opcion) 
        {
            case 0: //Nodo
                agregarNodoAlGrafo(grafo);
                break;

            case 1: //Arista
                agregarAristaAlGrafo(grafo);
                break;
            case 2: //Terminar
            
                
                break;
        
            default: // Salir 
                verificarSalida();
                break;
        }
    }

    private static void verificarSalida() {
        boolean deseaSalir = Entrada.opcionSiNo("Seguro que desea salir?", "Confirmacion de Finalizacion del Porgrama");
        if(deseaSalir)
            System.exit(0);
    }

    private static void agregarAristaAlGrafo(Grafo grafo) {
        Nodo nodo1 = crearNodo("primer","de la Arista");
        Nodo nodo2 = crearNodo("segundo","de la Arista");
        float longitud = Entrada.pedirNumeroPositivo("Ingrese la longitud entre los nodos", "Ingresar Longitud de la Arista");
        grafo.agregar(new Arista(nodo1, nodo2, longitud));
    }

    private static void agregarNodoAlGrafo(Grafo grafo) {
        grafo.agregar(crearNodo());
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
