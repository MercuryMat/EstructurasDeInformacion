package Taller7;

import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void A (){

        PilaA A = new PilaA();

        A.ingresar(3);
        A.ingresar(2);
        A.ingresar(1);

        A.mostrarPila();


    }


    public static void main(String[] args){

       A();

    }

}
