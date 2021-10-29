package Taller7;


import java.util.Scanner;
import java.util.logging.Logger;

public class PilaA {

    static Logger log = Logger.getLogger(PilaA.class.getName());

    Scanner sc = new Scanner(System.in);

    int pilaNum [] = new int [2];
    int tope= -1 ;

    public void ingresar (int Pilan){



            tope= +1;

            pilaNum [tope] = Pilan;


    }

    public void sacar(){

        if (tope == -1){

            log.info("La pila esta vacia");

        }else {

            log.info("Se ha eliminado");

            pilaNum[tope] = 0;

        }

    }

    public void mostrarPila() {

        for (int tope = 2; tope>=0; tope--){

            log.info(""+pilaNum[tope]);

        }

    }

}



