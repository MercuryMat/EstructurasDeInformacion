import java.util.logging.Logger;

public class Grafo {

    static Logger log = Logger.getLogger(Grafo.class.getName());

    public static void main (String[] args){

        long matrizA[][]={{0,3,4,999999999,8,999999999}, {999999999,0,999999999,
                999999999,5,999999999}, {999999999, 999999999, 0, 999999999, 3, 999999999},
                {999999999,999999999,999999999,0,999999999,999999999}, {999999999, 999999999,
                999999999, 7, 0, 3}, {999999999, 999999999, 999999999, 2, 999999999, 0}};

        CaminoMinimo ruta = new CaminoMinimo();

        log.info(ruta.algoritmoFloyd(matrizA));

    }


}