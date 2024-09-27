package mx.unam.ciencias.modelado.practica4;

import mx.unam.ciencias.modelado.practica4.proxy.ClienteRemoto;

/**Clase principal del programa, corre todo. */
public class Main{

    /**Menu del programa. */
    private static ClienteRemoto menu;

    /**
     * Método main. ejecuta funciones del atributo menu.
     * @param args los argumentos en consola.
     */
    public static void main(String[] args){
        menu.main(args);
    }
}
