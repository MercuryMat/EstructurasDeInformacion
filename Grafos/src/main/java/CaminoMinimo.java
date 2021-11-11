public class CaminoMinimo {

    //Metodo para determinar todos los caminos 
    public String algoritmoFloyd(long [][] mAdy){

        int vertices = mAdy.length;
        long matrizAdyacencia [][] = mAdy;
        String caminos [][] = new String [vertices][vertices];
        String caminosAux [][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminitos="";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;

        //Inicializando las matrices caminos y caminosAux

        for( i=0 ; i< vertices ; i++ ){
            for (j=0; j<vertices ; j++) {

                caminos [i][j]="";
                caminosAux [i][j]="";

            }
        }

        for(k=0; k<vertices; k++){

            for(i=0; i<vertices; i++){

                for(j=0; j<vertices; j++){

                    temporal1 = matrizAdyacencia [i][j];
                    temporal2 = matrizAdyacencia [i][k];
                    temporal3 = matrizAdyacencia [k][j];
                    temporal4 = temporal2 + temporal3;

                    //Encontrar Minimo

                    minimo = Math.min(temporal1,temporal4);

                    if (temporal1 != temporal4){

                        if (minimo == temporal4){

                            caminoRecorrido = "";
                            caminosAux [i][j] = k + "";
                            caminos[i][j] = caminosR (i,k,caminosAux,caminoRecorrido) + (k + 1);

                        }

                    }

                    matrizAdyacencia [i][j] = (long) minimo;


                }

            }

        }

         //Agregando el camino a cadena
        for( i=0 ; i< vertices ; i++ ){
            for (j=0; j<vertices ; j++) {

                cadena = cadena +" [ "+ matrizAdyacencia [i][j] +" ] ";

            }

            cadena = cadena + "\n";

        }

        /////////////////////////
        for( i=0 ; i< vertices ; i++ ){
            for (j=0; j<vertices ; j++) {

                if(matrizAdyacencia [i][j] != 1000000000){

                    if(i != j){

                        if(caminos[i][j].equals("")){

                            caminitos += "De ( "+ (i + 1) + " --------> "+(j+1)+" ) Irse por... ( "+(i+1)+ ", "+ (j+1) +" )\n";

                        }else{

                            caminitos += "De ( "+ (i + 1) + " --------> "+(j+1)+" ) Irse por... ( "+(i+1)+ ", "+ caminos[i][j]+", "+(j+1) +" )\n";


                        }

                    }

                }

            }
        }

        return "La matriz de Caminos as cortos entre los diferentes vértices es: \n"+ cadena+
                "\nLos diferentes caminos mas cortos entre vertices son; \n" + caminitos;

    }

    public String caminosR (int i, int k,String [][] caminosAux, String caminoRecorrido){

        if (caminosAux [i][k].equals("")){

            return "";

        }else{

            //Recursividad
            caminoRecorrido += caminosR(i, Integer.parseInt(caminosAux[i][k].toString()), caminosAux, caminoRecorrido)+(Integer.parseInt(caminosAux[i][k].toString())+1)+", ";
            return caminoRecorrido;

        }

    }


}
