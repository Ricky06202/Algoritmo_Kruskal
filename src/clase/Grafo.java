package clase;

import java.util.ArrayList;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Grafo {
    private int cantidadNodos = 0;
    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();
    private ArrayList<Arista> aristas = new ArrayList<Arista>();

    //!funciones para NODOS
    public void agregarNodo(Nodo nodo){
        if(!existeNodo(nodo)){
            nodos.add(nodo);
            cantidadNodos++;
        }
    }

    public void quitarNodo(Nodo nodo){
        if(existeNodo(nodo)){
            nodos.remove(nodo);
            cantidadNodos--;
        }
    }

    public void quitarPrimerNodo(){
        if(nodos.size() > 0){
            nodos.remove(0);
            cantidadNodos--;
        }
    }

    public void quitarUltimoNodo(){
        if(nodos.size() > 0){
            nodos.remove(nodos.size()-1);
            cantidadNodos--;
        }
    }

    private boolean existeNodo(Nodo actual){
        for (Nodo nodo : nodos) {
            if(nodo.equals(actual))
                return true;
        }
        return false;
    }

    //!Funciones para ARISTAS
    public void agregarArista(Arista arista){
        if(!existeArista(arista)){
            aristas.add(arista);
            agregarNodosFaltantes(arista);
        }
    }

    public void quitarArista(Arista arista){
        if(existeArista(arista))
            aristas.remove(arista);
    }

    public void quitarPrimerArista(){
        if(aristas.size() > 0)
            aristas.remove(0);
    }

    public void quitarUltimoArista(){
        if(aristas.size() > 0)
            aristas.remove(aristas.size()-1);
    }
    
    private boolean existeArista(Arista actual){
        for (Arista arista : aristas) {
            if(arista.equals(actual))
                return true;
        }
        return false;
    }

    private void agregarNodosFaltantes(Arista arista){
        if(!existeNodo(arista.getNodo1()))
            agregarNodo(arista.getNodo1());
        if(!existeNodo(arista.getNodo2()))
            agregarNodo(arista.getNodo2());
    }

}
