package clase;

// definir las caracteristicas(variables) y sus metodos(funciones)

public class Arista {
    private int longitud;
    private Nodo nodo1;
    private Nodo nodo2;
    
    public void setLongitud(int longitud){
        this.longitud=longitud;
    }

    public void setNodo1(Nodo nodo1){
        this.nodo1=nodo1;
    }

    public void setNodo2(Nodo nodo2){
        this.nodo2=nodo2;
    }

    public int getLongitud(){
        return longitud;
    }

    public Nodo getNodo1(){
        return nodo1;
    }

    public Nodo getNodo2(){
        return nodo2;
    }
}
