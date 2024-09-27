package mx.unam.ciencias.modelado.practica4;

import mx.unam.ciencias.modelado.practica4.simulacion.MenuGeneral;

/**Clase principal del programa, corre todo. */
public class Main{

    /**Menu del programa. */
    private static MenuGeneral menu;

    /**
     * Método main. ejecuta funciones del atributo menu.
     * @param args los argumentos en consola.
     */
    public static void main(String[] args){
        menu = new MenuGeneral();

        while(true){
            menu.solicitaDocumento();
            menu.solicitaImpresion();
        }
    }
}
