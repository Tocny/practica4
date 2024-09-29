package mx.unam.ciencias.modelado.practica4.simulacion;

import mx.unam.ciencias.modelado.practica4.empresa.*;
import mx.unam.ciencias.modelado.practica4.common.MetodosGet;

/**Clase de menu, para poder armar una instancia de Empleado con entradas del usuario. */
public class MenuEmpleado{

    /** Entero que almacena el valor del piso del empleado */
    private int piso;

    /**
     * Metodo que crea un documento como lo solicita el usuario
     * @return Documento solicitado
     */
    public Empleado construyeEmpleado(){
        return new Empleado(solicitaNombre(), solicitaRfc(), solicitaArea(), piso);
    }

    /**
     * Metodo que pide al usuario que ingrese el nombre del documento y lo regresa como String
     * @return nombre del documento
     */
    private String solicitaNombre(){
        String nombre;
        nombre = MetodosGet.getString("Por favor ingrese su nombre: ", "Debe de contener al menos un caracter");
        return nombre;
    }

    /**
     * Metodo que pide al usuario que ingrese su rfc y lo regresa como string
     * @return
     */
    private String solicitaRfc(){
        String rfc;
        rfc = MetodosGet.getString("Por favor ingresa tu rfc: ", "Debe contener al menos 13 caracteres");
        return rfc;
    }

    /**
 * Método que pide al usuario que ingrese el área en la que trabaja, la retorna para el enum y además le asigna un piso.
 * @return el área de trabajo seleccionada por el usuario.
 */
private AreaDeTrabajo solicitaArea() {
    int seleccion;
    AreaDeTrabajo area = null; // Inicializamos area
    // Mostrar opciones al usuario y obtener la selección
    seleccion = MetodosGet.getInt(
        "Selecciona el área en la que trabaja:\n" +
        "1. Atención a clientes\n" +
        "2. Recursos humanos\n" +
        "3. Contabilidad\n" +
        "4. Desarrollo\n" +
        "5. Mercadotecnia\n" +
        "6. Dirección", 
        "Debe ingresar un valor del 1 al 6", 1, 6);

    switch (seleccion) {
        case 1: 
            area = AreaDeTrabajo.ATENCION_A_CLIENTES; 
            piso = 1; 
            break;
        case 2: 
            area = AreaDeTrabajo.RECURSOS_HUMANOS; 
            piso = 2; 
            break;
        case 3: 
            area = AreaDeTrabajo.CONTABILIDAD; 
            piso = 3; 
            break;
        case 4: 
            area = AreaDeTrabajo.DESARROLLO; 
            piso = 4; 
            break;
        case 5: 
            area = AreaDeTrabajo.MERCADOTECNIA; 
            piso = 4; 
            break;
        case 6: 
            area = AreaDeTrabajo.DIRECCION; 
            piso = 5; 
            break;
        default:
            throw new IllegalArgumentException("Selección inválida");
    }

    // Devolver el área seleccionada
    return area;
}

}