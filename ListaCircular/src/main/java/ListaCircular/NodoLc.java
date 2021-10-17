package ListaCircular;

public class NodoLc {
    
    int dato;
    NodoLc siguiente;
    public NodoLc(int d){
        dato=d;
        siguiente=this;
    }
    
}
