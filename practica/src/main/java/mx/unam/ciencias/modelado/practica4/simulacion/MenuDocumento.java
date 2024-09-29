package mx.unam.ciencias.modelado.practica4.simulacion;

import mx.unam.ciencias.modelado.practica4.empresa.Documento;
import mx.unam.ciencias.modelado.practica4.common.MetodosGet;

/**Clase menu documento para constituir una instancia de Documento. */
public class MenuDocumento{

    /**
     * Metodo que crea un documento como lo solicita el usuario
     * @return Documento solicitado
     */
    public Documento construyeDocumento(){
        return new Documento(solicitaNombreDocumento(), solicitaContenido(), solicitaAColor());
    }

    /**
     * Metodo que pide al usuario que ingrese el nombre del documento y lo regresa como String
     * @return nombre del documento
     */
    private String solicitaNombreDocumento(){
        String nombre;
        nombre = MetodosGet.getString("Por favor ingresa el nombre del documento", "Debe de contener al menos un caracter");
        return nombre;
    }

    /**
     * Metodo que pide al usuario que ingrese el contenido del documento y lo regresa como String
     * @return contenido del documento
     */
    private String solicitaContenido(){
        String contenido;
        contenido = MetodosGet.getString("Ingresa el contenido del documento", "El documento no puede estar vacio");
        return contenido;
    }

    /**
     * Metodo que solicita al usuario que indique si el documento debe imprimirse en blanco y negro o a color
     * @return booleano que indica si el documento será a color
     */
    private boolean solicitaAColor(){
        int eleccion;
        boolean color;
        eleccion = MetodosGet.getInt("Indica si el documento será en B/N (0) o a color (1)", "Debes de ingresar 0 o 1", 0, 1);
        color = eleccion == 0 ? false : true;
        return color;
    }
}