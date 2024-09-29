package mx.unam.ciencias.modelado.practica4.empresa;

import java.io.Serializable;

/**Clase para los documentos que pueden ser imprimibles. */
public class Documento implements Serializable{

    /**ID de versión. */
    private static final long serialVersionUID = 1L;

    /**Cadena que almacena el nombre del documento */
    private String nombreDocumento;

    /**Cadena que almacena el contenido del documento */
    private String contenido;

    /**Booleano que indica si el documento se imprime a color */
    private boolean esAColor;

    /** Autor del documento (puede representar un solicitante de impresion) */
    private String autor = "";

    /**
     * Constructor que crea una instancia de documento, con contenido, nombre y si es a color
     * @param nombreDocumento el nombre del documento.
     * @param contenido el contenido del documento.
     * @param esAColor un booleano indicando si es a color.
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
     * @param nombreDocumento una cadena que representa el nombre del documento.
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
     * @param contenido una cadena que representa el contenido del documento.
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
     * @param esAColor un booleano indicando si el documento es a color.
     */
    public void setEsAColor(boolean esAColor){
        this.esAColor = esAColor;
    }

    /**
     * Getter del autor.
     * @return el atributo autor.
     */
    public String getAutor(){
        return autor;
    }

    /**
     * Setter del autor.
     * @param autor el nombre del autor.
     */
    public void setAutor(String autor){
        this.autor = autor;
    }
}