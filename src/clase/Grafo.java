package clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Grafo {
    private int cantidadNodos = 0;
    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();
    private ArrayList<Arista> aristas = new ArrayList<Arista>();

    @Override
    public String toString() {
        return String.format("Nodos = (%s)\nAristas = (%s)", 
        nodos.toString().substring(1, nodos.toString().length()-1),
        cadenaAristas());
    }

    private String cadenaAristas(){
        String resultante = "";
        int conteo = 0;
        for (Arista arista : aristas) {
            if(conteo == 0)
                resultante += arista;
            else
                resultante += ", " + arista;
            if(++conteo % 5 == 0)
                resultante += "\n";
        }
        return resultante;
    }
    //!funciones para NODOS
    public boolean agregar(Nodo nodo){
        boolean existe = existe(nodo);
        if(!existe){
            nodos.add(nodo);
            cantidadNodos++;
        }
        return !existe;
    }

    public boolean quitar(Nodo nodo){
        boolean existe = existe(nodo);
        if(existe){
            nodos.remove(nodo);
            cantidadNodos--;
        }
        return existe;
    }

    private boolean existe(Nodo actual){
        for (Nodo nodo : nodos) {
            if(nodo.equals(actual))
                return true;
        }
        return false;
    }

    //!Funciones para ARISTAS
    public boolean agregar(Arista arista){
        boolean existe = existe(arista);
        if(!existe){
            aristas.add(arista);
            agregarNodosFaltantes(arista);
        }
        return !existe;
    }

    public boolean quitar(Arista arista){
        boolean existe = existe(arista);
        if(existe)
            aristas.remove(arista);
        return existe;
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

    //!Funciones del Grafo
    public void ordenar(){
        Collections.sort(aristas, new Comparator<Arista>() {
            @Override
            public int compare(Arista a1, Arista a2) {
                return Float.valueOf(a1.getLongitud()).compareTo(Float.valueOf(a2.getLongitud()));
            }
        });
        Collections.sort(nodos, new Comparator<Nodo>() {

            @Override
            public int compare(Nodo n1, Nodo n2) {
                return n1.getNombre().compareTo(n2.getNombre());
            } 
        });
    }

}
