package clase;

import java.util.ArrayList;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Grafo {
    private int cantidadNodos = 0;
    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();
    private ArrayList<Arista> aristas = new ArrayList<Arista>();

    //!funciones para NODOS
    public void agregar(Nodo nodo){
        if(!existe(nodo)){
            nodos.add(nodo);
            cantidadNodos++;
        }
    }

    public void quitar(Nodo nodo){
        if(existe(nodo)){
            nodos.remove(nodo);
            cantidadNodos--;
        }
    }

    private boolean existe(Nodo actual){
        for (Nodo nodo : nodos) {
            if(nodo.equals(actual))
                return true;
        }
        return false;
    }

    //!Funciones para ARISTAS
    public void agregar(Arista arista){
        if(!existe(arista)){
            aristas.add(arista);
            agregarNodosFaltantes(arista);
        }
    }

    public void quitar(Arista arista){
        if(existe(arista))
            aristas.remove(arista);
    }
    
    private boolean existe(Arista actual){
        for (Arista arista : aristas) {
            if(arista.equals(actual))
                return true;
        }
        return false;
    }

    private void agregarNodosFaltantes(Arista arista){
        agregar(arista.getNodo1());
        agregar(arista.getNodo2());
    }

}
