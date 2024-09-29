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
     * @param nombreDocumento
     * @param contenido
     * @param esAColor
     */
    public Documento(String nombreDocumento, String contenido, boolean esAColor){
        this.nombreDocumento = nombreDocumento;
        this.contenido = contenido;
        this.esAColor = esAColor;
    }

    /**Metodo get para el nombre del documento
     * @return nombre del documento
     */
    public String getNombreDocumento(){
        return this.nombreDocumento;
    }

    /**Metodo set para el nombre del documento
     * @param nombreDocumento
     */
    public void setNombreDocumento(String nombreDocumento){
        this.nombreDocumento = nombreDocumento;
    }

    /**Metodo get para el contenido del documento
     * @return contenido del documento
     */
    public String getContenido(){
        return this.contenido;
    }

    /**Metodo set para el contenido del documento
     * @param contenido
     */
    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    /**Metodo get del color
     * @return si el documento está a color
     */
    public boolean getEsAColor(){
        return this.esAColor;
    }

    /**Metodo set para el color
     * @param esAColor
     */
    public void setEsAColor(boolean esAColor){
        this.esAColor = esAColor;
    }
}