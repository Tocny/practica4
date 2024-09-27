package mx.unam.ciencias.modelado.practica4.simulacion;

import mx.unam.ciencias.modelado.practica4.empresa.Documento;
import mx.unam.ciencias.modelado.practica4.common.MetodosGet;

/**Clase menu documento para constituir una instancia de Documento. */
public class MenuDocumento{

    /**
     * Método para constituir una instancia de Documento a partir de los demás métodos.
     * @return una instancia de Documento con datos proporcionados por el usuario.
     */
    public Documento construyeDocumento(){
        System.out.println("Por favor, ingrese los datos del documento que desea imprimir.");
        return new Documento(solicitaNombreDocumento(), solicitaContenido(), solicitaAColor());
    }

    /**
     * Método que solicita el nombre del documento al usuario.
     * @return una cadena introducida por el usuario.
     */
    private String solicitaNombreDocumento(){
        return MetodosGet.getString("Introduzca el nombre del documento: ", "Entrada inválida.");
    }

    /**
     * Método que solicita el contenido del documento al usuario.
     * @return una cadena introducida por el usuario.
     */
    private String solicitaContenido(){
        return MetodosGet.getString("Introduzca el contenido del documento: ", "Entrada inválida.");
    }

    /**
     * Método que maneja la posibilidad de que el usuario solicite a color la impresion del documento.
     * @return si el documento debe ser a color.
     */
    private boolean solicitaAColor(){
        String entrada = "";

        while(true){
            entrada = MetodosGet.getString("Desea imprimirlo a color (s/n) ", "Entrada inválida.");

            if(entrada.equals("s")){
                return true;

            }else if (entrada.equals("n")){
                return false;

            } else{
                System.out.println("Introduzca unicamente la letra 's' o la letra 'n'.");
            }

        }


    }
}