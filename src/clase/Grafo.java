package clase;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Grafo {
    private Nodo[] nodos;
    private Arista[] aristas;

    public Grafo(Nodo[] nodos, Arista[] aristas) {
        this.nodos = nodos;
        this.aristas = aristas;
    }

    public Nodo[] getNodos() {
        return nodos;
    }

    public void setNodos(Nodo[] nodos) {
        this.nodos = nodos;
    }

    public Arista[] getAristas() {
        return aristas;
    }

    public void setAristas(Arista[] aristas) {
        this.aristas = aristas;
    }

    
}
