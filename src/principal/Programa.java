package principal;
//Aqui se tiene que conectar las demás clases
public class Programa {
    public static void main(String[] args) {
        int aristaLong, i=0, sal=0, j=0, x;
        String[] nodo=new String[20], adyacente[15]=nodo[i-1]" es adyacente a: ";

        nodo[0] = JOptionPane.showInputDialog("Ingrese el nombre del primer nodo: "); 
        i++;
        while(i<21||sal==0){
            nodo[i]= JOptionPane.showInputDialog("Ingrese el siguiente nodo: ");
            for (x=i-1; x>=0; x--){
                opcion=JoptionPane.showConfirmDialog(null, "Este nodo es adyacente a "+nodo[x], "Nodo adyacente", JOptionPane.YES_NO_OPTION);
                if(opcion==0){
                    adyacente[j]= adyacente[j]+nodo[x]+" ";
                    aristaLong = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la arista"));
                    j++;
                    break;
                }
            }
            i++;
            sal=JoptionPane.showConfirmDialog(null, "Deseas añadir otro nodo "+nodo[i-1], "Nodo adyacente", JOptionPane.YES_NO_OPTION);
        }


    }
}
