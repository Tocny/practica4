package mx.unam.ciencias.modelado.practica4.empresa;

import java.io.Serializable;

/**Clase para los documentos que pueden ser imprimibles. */
public class Documento implements Serializable{

    /**ID de versión. */
    private static final long serialVersionUID = 1L;

    private String nombreDocumento;

    private String contenido;

    /**Booleano que indica si el documento se imprime a color */
    private boolean esAColor;

    /**
     * Constructor que crea una instancia de documento, con contenido, nombre y si es a color
     */
    public Documento(String nombreDocumento, String contenido, boolean esAColor){
        this.nombreDocumento = nombreDocumento;
        this.contenido = contenido;
        this.esAColor = esAColor;
    }

    public String getNombreDocumento(){
        return this.nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento){
        this.nombreDocumento = nombreDocumento;
    }

    public String getContenido(){
        return this.contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public boolean getEsAColor(){
        return this.esAColor;
    }

    public void setEsAColor(boolean esAColor){
        this.esAColor = esAColor;
    }
}