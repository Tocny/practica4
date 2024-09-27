package mx.unam.ciencias.modelado.practica4.empresa;

import java.io.Serializable;

/**Clase empleado, constituye objetos de tipo Empleado. */
public class Empleado implements Serializable{

    /**ID de versión. */
    private static final long serialVersionUID = 1L;
    /**Nombre del empleado. */
    private String nombre;
    /**Clave RFC del empleado. */
    private String rfc;
    /**Piso en el que trabaja. */
    private int piso;
    /**Area de trabajo. */
    private AreaDeTrabajo area;

    /**
     * Constructor de la clase. Asigna atributos.
     * @param nombre el nombre del empleado
     * @param rfc el rfc del empleado.
     * @param areaDeTrabajo el área de trabajo del empleado.
     * @param piso el piso en el que trabaja el empleado.
     */
    public Empleado(String nombre, String rfc, int piso, AreaDeTrabajo area) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.area = area;
        this.piso = piso;
    }

    /** 
     * Getter del nombre del empleado.
     * @return el nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /** 
     * Setter del nombre del empleado.
     * @param nombre el nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** 
     * Getter del RFC del empleado.
     * @return el RFC del empleado.
     */
    public String getRfc() {
        return rfc;
    }

    /** 
     * Setter del RFC del empleado.
     * @param rfc el RFC del empleado.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /** 
     * Getter del piso en el que trabaja el empleado.
     * @return el piso en el que trabaja el empleado.
     */
    public int getPiso() {
        return piso;
    }

    /** 
     * Setter del piso
     * @param piso el piso en el que trabaja el Empleado.
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }

    /** 
     * Getter del área de trabajo del empleado.
     * @return el área de trabajo del empleado.
     */
    public AreaDeTrabajo getArea() {
        return area;
    }

    /** 
     * Setter del área de trabajo del empleado.
     * @param area el área de trabajo del empleado.
     */
    public void setArea(AreaDeTrabajo area) {
        this.area = area;
    }
}