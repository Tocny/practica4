package mx.unam.ciencias.modelado.practica4.empresa;

import java.io.Serializable;

/**Clase para los documentos que pueden ser imprimibles. */
public class Documento implements Serializable{

    /**ID de versión. */
    private static final long serialVersionUID = 1L;
    /**Nombre del documento a imprimir. */
    private String nombreDocumento;
    /**Contenido del documento. */
    private String contenido;
    /**Indicador de si ha de imprimirse a color. */
    private boolean esAColor;
    /**Autor (o persona que solicitó el documento). */
    private String autor;

    /**
     * Constructor de la clase. inicializa atributos.
     * @param nombreDocumento el nombre del documento.
     * @param contenido el contenido del documento.
     * @param esAColor indica si el documento debe imprimirse a color.
     */
    public Documento(String nombreDocumento, String contenido, boolean esAColor) {
        this.nombreDocumento = nombreDocumento;
        this.contenido = contenido;
        this.esAColor = esAColor;
    }

    /**
     * Getter del nombre del documento.
     * @return el nombre del documento.
     */
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    /**
     * Setter del nombre del documento.
     * @param nombreDocumento el nombre del documento.
     */
    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    /**
     * Getter del contenido del documento.
     * @return el contenido del documento.
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Setter del contenido del documento.
     * @param contenido el contenido del documento.
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Getter del atributo esAColor.
     * @return El valor del atributo esAColor.
     */
    public boolean getEsAColor() {
        return esAColor;
    }

    /**
     * Setter de si el documento debe imprimirse a color.
     * @param esAColor un valor booleano indicando si se debe imprimr a color.
     */
    public void setEsAColor(boolean esAColor) {
        this.esAColor = esAColor;
    }

    /**
     * Getter del autor del documento.
     * @return el atributo autor.
     */
    public String getAutor(){
        return autor;
    }

    /**
     * Setter del autor del documento.
     * @param autor un autor.
     */
    public void setAutor(String autor){
        this.autor = autor;
    }
}