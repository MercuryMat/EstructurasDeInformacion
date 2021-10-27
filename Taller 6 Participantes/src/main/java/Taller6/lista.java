package Taller6;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class lista {

    static Logger log = Logger.getLogger(lista.class.getName());

    nodo primero;
    nodo ultimo;
    int dato;
    Scanner teclado = new Scanner(System.in);

    public lista (){

        primero = null;
        ultimo = null;

    }

    public void ingresar (int x){

        nodo nuevo = new nodo();
        nuevo.datos = x;

        if(primero == null){

            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;

        }else {

            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;

        }

    }

    public void mostrar (){

        nodo actual = new nodo();
        actual = primero;
        do{

            log.log(Level.INFO, actual.datos);
            actual = actual.siguiente;

        }while (actual != primero);

    }

    public void buscar (int x){

        nodo actual = new nodo();
        actual = ultimo;
        boolean encontrar = false;

        do{

            if(actual.datos == x){

                encontrar = true;
                dato= actual.datos;

            }

            actual = actual.anterior;

        }while (actual != ultimo);

        if(encontrar == true){

            log.log(Level.INFO,"Participante encontrado");
            log.log(Level.INFO,dato);

        }else {

            log.log(Level.INFO,"Participante no encontrado");

        }

    }

    public void modificar (int x){

        nodo actual = new nodo();
        actual = primero;

        do{

            if (actual.datos == x){

                log.log(Level.INFO,"Ingrese un nuevo valor");
                actual.datos = teclado.nextInt();

            }

            actual = actual.siguiente;

        }while (actual != primero);

    }

}
