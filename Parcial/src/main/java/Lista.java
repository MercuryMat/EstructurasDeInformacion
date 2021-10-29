import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Lista {

    static Logger log = Logger.getLogger(Lista.class.getName());

        public final static BufferedReader leer = new BufferedReader(new InputStreamReader (System.in));

        public static void main(String args[]) throws IOException {

            log.info("Escriba el numero de personas");

            int personas = Integer.parseInt(leer.readLine());
            vivo(personas, 2);

        }

        private static void vivo(int personas, int iJump) {

            String[] resolver = new String[personas+1];
            int muertes = personas;
            int salto = 0;
            int contador = 0;

            // Creador del array
            for(int i = 1; i != personas+1; i++) {
                resolver[i] = String.valueOf(i);
                //log.info(resolver[i]);
            }

            // Orden de suicidios
            while(muertes > 2) { // Mientras hay más de dos sobrevivientes
                if(salto != personas+1) {	 // Mientras que no llege al final de la linea de soldados
                    if(resolver[salto] != null) { // Si el soldado está vivo
                        if(contador == iJump) { // Si se cumplen los saltos
                            resolver[salto] = null; // Lo matamos
                            contador = 0; // Reseteamos el contador de saltos
                            muertes = muertes - 1; // Descontamos un sobreviviente
                        }else{
                            contador = contador + 1; // Si no se cumplen los saltos, lo saltamos y sumamos un salto
                        }
                        // Si no está vivo, no hacemos nada
                    }
                    salto = salto + 1;
                }else{
                    // Si llega al final de la linea
                    salto = 0;
                }
            }

            log.info("--------------");

            // Buscar Sobrevivientes
            for(int x = 1; x < personas+1; x++) {
                if(resolver[x] != null)
                    log.info("La persona numero: "+resolver[x]+" ha sobrevivido.");
            }

            log.info("--------------");
        }
    }