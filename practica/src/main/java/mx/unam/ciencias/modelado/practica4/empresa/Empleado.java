package mx.unam.ciencias.modelado.practica4.empresa;

import java.io.Serializable;

/**Clase empleado, constituye objetos de tipo Empleado. */
public class Empleado implements Serializable{

    /**ID de versión. */
    private static final long serialVersionUID = 1L;

    private String nombre;
    
    private String rfc;

    private int piso;

    private AreaDeTrabajo area;

    public Empleado(String nombre, String rfc, AreaDeTrabajo area, int piso){
        this.nombre = nombre;
        this.rfc = rfc;
        this.piso = piso;
        this.area = area;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRfc(){
        return this.rfc;
    }

    public void setRfc(String rfc){
        this.rfc = rfc;
    }

    public int getPiso(){
        return this.piso;
    }

    public void setPiso(int piso){
        this.piso = piso;
    }

    public AreaDeTrabajo getArea(){
        return this.area;
    }

    public void setArea(AreaDeTrabajo area){
        this.area = area;
    }
}