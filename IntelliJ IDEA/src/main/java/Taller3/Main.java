
package Taller3;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.util.Scanner;
import static Taller3.Funciones.*;


public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {


        //Para leer por teclado
        Scanner sc = new Scanner(System.in);


        //Muestra la funcion factorial
        log.log(Level.INFO, "Ingrese un número para calcular su factorial: ");//pedir dato
        int num = sc.nextInt();
        log.log(Level.INFO, "El factorial de: " + num + " es: " + factorial(num) );


        //Muestra la funcion potencia
        log.log(Level.INFO, "Ingrese la base de la potencia: ");
        int vari = sc.nextInt();
        log.log(Level.INFO, "Ingrese el exponente de la potencia: ");
        int expo = sc.nextInt();
        log.log(Level.INFO,  vari + " elevado a " + expo + " es igual a: "+ potencia(vari, expo));



        int a= 96, b= 36;//Valores de los números
        log.log(Level.INFO, "mcd( " + a + ", " + b + " )= " + mcd(a,b));//mostrar resultados

    }

}
