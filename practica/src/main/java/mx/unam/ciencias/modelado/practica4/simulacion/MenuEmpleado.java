package mx.unam.ciencias.modelado.practica4.simulacion;

import mx.unam.ciencias.modelado.practica4.empresa.*;
import mx.unam.ciencias.modelado.practica4.common.MetodosGet;

/**Clase de menu, para poder armar una instancia de Empleado con entradas del usuario. */
public class MenuEmpleado{

    /**
     * Método que genera una instancia de Empleado a partir de los demás métodos. 
     * @return una instancia de Empleado con datos proporcionados por el usuario.
     */
    public Empleado construyeEmpleado(){
        System.out.println("Por favor, ingrese sus datos como empleado.");
        return new Empleado(solicitaNombre(), solicitaRFC(), solicitaPiso(), solicitaAreaDeTrabajo());
    }

    /**
     * Método que solicita el nombre del empleado.
     * @return una cadena introducida por el usuario.
     */
    private String solicitaNombre(){
        return MetodosGet.getString("Introduzca su nombre: ", "Entrada inválida.");
    }

    /**
     * Método que solicita el rfc del empleado.
     * @return una cadena introducida por el usuario.
     */
    private String solicitaRFC(){
        return MetodosGet.getString("Introduzca su rfc: ", "Entrada inválida.");
    }

    /**
     * Método que solicita el piso en el que trabaja el empleado.
     * @return un entero introducido por el usuario.
     */
    private int solicitaPiso(){
        return MetodosGet.getInt("Introduzca el piso en el que trabaja.",  "Entrada inválida.", 1, 5);
    }

    /**
     * Método para que el usuario seleccione un area de trabajo.
     * @return una instancia AreaDeTrabajo selecionada por el usuario.
     */
    private AreaDeTrabajo solicitaAreaDeTrabajo(){
        StringBuilder sb = new StringBuilder();
        sb.append("1. Atención a clientes.\n");
        sb.append("2. Recursos humanos.\n");
        sb.append("3. Contabilidad.\n");
        sb.append("4. Desarrollo.\n");
        sb.append("5. Mercadotecnia.\n");
        sb.append("6. Dirección.\n");

        int eleccion = MetodosGet.getInt("Seleccione un área: \n" + sb.toString(), "Entrada inválida", 1, 6);

        return AreaDeTrabajo.values()[eleccion-1];
    }
}