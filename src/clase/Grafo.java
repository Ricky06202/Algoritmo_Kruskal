package clase;

import java.util.ArrayList;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Grafo {
    private ArrayList<Nodo> nodos;
    private ArrayList<Arista> aristas;

    public Grafo(ArrayList<Nodo>  nodos, ArrayList<Arista> aristas) {
        this.nodos = nodos;
        this.aristas = aristas;
    }

    public ArrayList<Nodo>  getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo>  nodos) {
        this.nodos = nodos;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }

    
}
