package clase;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Arista {
    private Nodo nodo1;
    private Nodo nodo2;
    private float longitud;

    public Arista(Nodo nodo1, Nodo nodo2, float longitud) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.longitud = longitud;
    }

    public boolean esBucle(){
        return nodo1.equals(nodo2);
    }

    public Nodo RegresarOpuesto(Nodo actual){
        return actual != nodo1 ? nodo1 : nodo2;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) 
            return true;
        if(obj instanceof Arista){
            Arista otraArista = (Arista)obj;
            if(nodo1.equals(otraArista.nodo1) && nodo2.equals(otraArista.nodo2))
                return true;
            else if(nodo1.equals(otraArista.nodo2) && nodo2.equals(otraArista.nodo1))
                return true;
        }
        return false;
    }

    public void setLongitud(float longitud){
        this.longitud=longitud;
    }

    public void setNodo1(Nodo nodo1){
        this.nodo1=nodo1;
    }

    public void setNodo2(Nodo nodo2){
        this.nodo2=nodo2;
    }

    public float getLongitud(){
        return longitud;
    }

    public Nodo getNodo1(){
        return nodo1;
    }

    public Nodo getNodo2(){
        return nodo2;
    }
}
