package Taller4;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Dulces {

    static Logger log = Logger.getLogger(Dulces.class.getName());

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String dul;




        ArrayList <String> Dulce = new ArrayList<String>();

        Dulce.add("Chocorramo");

        log.log(Level.INFO, "ingrese 9 dulces sin incluir chocorramo");

        for (int i = 0; i<10; i++ ){

            dul = sc.nextLine();
            Dulce.add(dul);

        }
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

        for (int i = 0 ; i < Dulce.size(); i++){

            log.log(Level.INFO, Dulce.get(i));

        }


    }


}