package clase;

// definir las caracteristicas(variables) y sus metodos(funciones)


public class Nodo {
    private String nombre;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Nodo){
            Nodo otroNodo = (Nodo)obj;
            return nombre.equalsIgnoreCase(otroNodo.nombre);
        } 
        return false; 
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
