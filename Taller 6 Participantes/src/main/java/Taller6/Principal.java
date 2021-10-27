package Taller6;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Principal {

    static Logger log = Logger.getLogger(Principal.class.getName());

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        lista lista1 = new lista();

        lista1.ingresar(3);
        lista1.ingresar(4);


        int opcion = 0;
        do{

            log.log(Level.INFO, "Digite la opcion que desea seguir");
            log.log(Level.INFO, "1. Un nuevo participante");
            log.log(Level.INFO, "2. Mostrar todos los participantes registrados");
            log.log(Level.INFO, "3. Buscar un participante");
            log.log(Level.INFO, "4. Modificar el nnumero de un participante");
            log.log(Level.INFO, "5. Salir");
            log.log(Level.INFO, "Digite una opcion");

            opcion = teclado.nextInt();

            switch (opcion){

                case 1:
                    log.log(Level.INFO, "Ingrese un nodo");
                    int dato = teclado.nextInt();
                    lista1.ingresar(dato);
                    break;

                case 2:

                    log.log(Level.INFO, "Mostrar");
                    lista1.mostrar();
                    break;

                case 3:

                    log.log(Level.INFO, "Buscar");
                    log.log(Level.INFO, "Inserte el nodo que desea buscar");
                    int dato3 = teclado.nextInt();
                    lista1.buscar(dato3);

                    break;

                case 4:

                    log.log(Level.INFO, "Ingrese el dato a modificar");
                    int dato4 = teclado.nextInt();
                    lista1.modificar(dato4);

                    break;

            }



        }while (opcion != 5 );

    }

}
