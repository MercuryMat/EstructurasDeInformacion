package ListaCircular;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.swing.*;

public class ListaLc {

    static Logger log = Logger.getLogger(ListaLc.class.getName());

    NodoLc ultimo;
    public ListaLc (){

        ultimo=null;

    }
//Metodo para saber si la lista esta vacia

    public boolean estaVacia () {

        return ultimo == null;

    }
    //Metodo para insertar

    public ListaLc insertar (int elemento){

        NodoLc nuevo = new NodoLc(elemento);

        if (ultimo != null){

            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;

        }

        ultimo = nuevo;
        return this;

    }
//Metodo para mostrar la lista

    public void MostrarLista (){

        NodoLc aux = ultimo.siguiente;
        String cadena = "";
        //log.log(Level.INFO, "");
        do{

            cadena=cadena+"["+aux.dato+"]->";
            aux = aux.siguiente;

        }while (aux != ultimo.siguiente);

        JOptionPane.showMessageDialog(null, cadena, "Mostrando la Lista Circular", JOptionPane.INFORMATION_MESSAGE);

    }


}
