package mx.unam.ciencias.modelado.practica4.empresa;

import java.io.Serializable;

/**
 * Clase empleado, constituye objetos de tipo Empleado.
 */
public class Empleado implements Serializable{

    /** ID de versión para la serialización. */
    private static final long serialVersionUID = 1L;

    /** Cadenas que almacenan el nombre y el rfc del empleado */
    private String nombre;
    private String rfc;

    /** Entero que almacena el piso en el que trabaja el empleado */
    private int piso;

    /** ENUM del area de trabajo del empleado */
    private AreaDeTrabajo area;

    /**
     * Constructor que inicializa un empleado con los datos especificados.
     *
     * @param nombre El nombre del empleado.
     * @param rfc El RFC del empleado.
     * @param area El área de trabajo del empleado.
     * @param piso El piso donde trabaja el empleado.
     */
    public Empleado(String nombre, String rfc, AreaDeTrabajo area, int piso){
        this.nombre = nombre;
        this.rfc = rfc;
        this.piso = piso;
        this.area = area;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Obtiene el RFC del empleado.
     *
     * @return El RFC del empleado.
     */
    public String getRfc(){
        return this.rfc;
    }

    /**
     * Establece el RFC del empleado.
     *
     * @param rfc El RFC a establecer.
     */
    public void setRfc(String rfc){
        this.rfc = rfc;
    }

    /**
     * Obtiene el piso en el que trabaja el empleado.
     *
     * @return El piso del empleado.
     */
    public int getPiso(){
        return this.piso;
    }

    /**
     * Establece el piso en el que trabaja el empleado.
     *
     * @param piso El piso a establecer.
     */
    public void setPiso(int piso){
        this.piso = piso;
    }

    /**
     * Obtiene el área de trabajo del empleado.
     *
     * @return El área de trabajo del empleado.
     */
    public AreaDeTrabajo getArea(){
        return this.area;
    }

    /**
     * Establece el área de trabajo del empleado.
     *
     * @param area El área de trabajo a establecer.
     */
    public void setArea(AreaDeTrabajo area){
        this.area = area;
    }
}
