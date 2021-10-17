package ListaCircular;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.swing.*;

public class ListaCircular {

    static Logger log = Logger.getLogger(ListaLc.class.getName());

public static void main(String[] args){

    ListaLc listita = new ListaLc();

    int opcion = 0, elemento;

    do{

        try {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar un nodo al la lista circular\n"
            +"2. Eliminar un nodo de la lista circular\n"
            +"3. Mostrar los datos de la lista circular\n"
            +"4. Salir\n"
            +"¿Que desea hacer?", "Menú de Opciones",JOptionPane.INFORMATION_MESSAGE));

            switch (opcion){
                case 1:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del Nodo", "Agregando Nodo a la Lista Circular",
                            JOptionPane.INFORMATION_MESSAGE));

                    listita.insertar(elemento);

                    break;

                case 2:



                    break;

                case 3:

                    if (!listita.estaVacia()){
                            listita.MostrarLista();
                    }else {
                       JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                               "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;

                case 4:

                    JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                            "FIN", JOptionPane.INFORMATION_MESSAGE);

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "La Opcion no esta en el Menú",
                            "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

            }

        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null, "ERROR" + n.getMessage());
        }
    }while (opcion !=4);

}

}
