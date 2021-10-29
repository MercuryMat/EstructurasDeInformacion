package Taller7;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {



    static Logger log = Logger.getLogger(Main.class.getName());

    public static void pila() {

        PilaLista pila = new PilaLista();
        pila.insertar(3);
        pila.insertar(2);
        pila.insertar(1);

        log.log(Level.INFO, ""+pila.quitar());
        log.log(Level.INFO, ""+pila.quitar());
        log.log(Level.INFO, ""+pila.quitar());
        log.log(Level.INFO, ""+pila.quitar());
        log.log(Level.INFO, ""+pila.quitar());


    }

    public static void cola(){

        ColaLista cola = new ColaLista();

        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);

        log.log(Level.INFO, ""+cola.quitar());
        log.log(Level.INFO, ""+cola.quitar());
        log.log(Level.INFO, ""+cola.quitar());

    }

        public static void main (String[] args){


            Scanner teclado = new Scanner(System.in);

        int cont;

        do {
            log.info("Digite la opcion que quiera ver");
            log.info( "1. Pila");
            log.info( "2. Cola");
            log.info( "3. Salir");

            cont = teclado.nextInt();


            switch (cont){

                case 1:
                    pila();
                    break;

                case 2:
                    cola();
                    break;

            }

        }while (cont !=3);




        }

        public static void print(String numero){

            log.log(Level.INFO,numero);
        }

}
