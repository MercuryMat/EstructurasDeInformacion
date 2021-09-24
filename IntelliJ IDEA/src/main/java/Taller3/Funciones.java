package Taller3;



import java.util.Scanner;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

    public class Funciones {

        //para usar la funcion log
        static Logger log = Logger.getLogger(Funciones.class.getName());

        public static int mcd(int a, int b) {


            if (b == 0) {

                return a;

            } else {
                return mcd(b, a % b);//funcion para hallar el maximo comun divisor

            }

        }

        public static int factorial(int numero) {

            if (numero > 0) {
                int valor = numero * factorial(numero - 1);

                return valor;

            }
            return 1;
        }

        public static int potencia(int vari, int expo) {

            if (expo == 1) {

                return vari;

            } else if (expo == 0) {

                return 1;

            } else {
                return vari * potencia(vari, expo - 1);
            }

        }
    }

