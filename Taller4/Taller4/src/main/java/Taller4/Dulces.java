package Taller4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Dulces {


    static Logger log = Logger.getLogger(Dulces.class.getName());

    public static void imprimirIterando (){

        Scanner sc = new Scanner(System.in);

        String dul;

        ArrayList <String> Dulce = new ArrayList<String>();
        Dulce.add("Chocorramo");

        for (int i = 0; i<9; i++ ) {
            dul = sc.nextLine();
            Dulce.add(dul);
        }

        Iterator<String> miIterador = Dulce.iterator();

        while(miIterador.hasNext()){

            log.log(Level.INFO, miIterador.next());//imprimir iterando

        }

    }

    public static void ImprimirSinIterador(){

        Scanner scs = new Scanner(System.in);

        String dulc;

        ArrayList <String> Dulces = new ArrayList<String>();
        Dulces.add("Chocorramo");

        for (int i = 0; i<9; i++ ) {
            dulc = scs.nextLine();
            Dulces.add(dulc);
        }

        for (int i = 0 ; i < Dulces.size(); i++){//imprimir sin iterador
            log.log(Level.INFO, Dulces.get(i));
        }

    }


    public static void main(String[] args){

        /*
                    Dulce.add("Bon bom bum");
                    Dulce.add("Yogo premio");
                    Dulce.add("Ponque ramo");
                    Dulce.add("Mani moto");
                    Dulce.add("Kinder sorpresa");
                    Dulce.add("Papas margarita");
                    Dulce.add("Todo Rico");
                    Dulce.add("Detodito");
                    Dulce.add("Gelatina boggy");
*/

        Scanner sc = new Scanner(System.in);

        int seleccion;

        do {

            log.log(Level.INFO, "--------------Array list--------------");
            log.log(Level.INFO, "1. Imprimir sin iterador");
            log.log(Level.INFO, "2. Imprimir con iterador");
            log.log(Level.INFO, "3. Salir");
            log.log(Level.INFO, "Digite la opcion que desea realizar: ");
            seleccion= sc.nextInt();

            if (seleccion > 3){
                System.out.println("Digite un numero valido");
            } else if (seleccion <= 0 ){
                System.out.println("Digite un numero valido");
            }


            switch (seleccion){



                case 1:
                    log.log(Level.INFO, "ingrese 9 dulces sin incluir chocorramo");
                    ImprimirSinIterador();

                    break;

                case 2:

                    log.log(Level.INFO, "ingrese 9 dulces sin incluir chocorramo");
                    imprimirIterando();


                    break;

            }


        }while(seleccion !=3);

    }

}
