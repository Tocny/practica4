package mx.unam.ciencias.modelado.practica4.proxy;

import mx.unam.ciencias.modelado.practica4.empresa.Empleado;
import mx.unam.ciencias.modelado.practica4.empresa.Documento;
import java.rmi.RemoteException;

/**Clase apuntadora del objeto de servicio. */
public class ImpresoraProxy implements ImpresoraInterface{

    /**Instancia de la impresora de servicio a la que apuntará la clase. */
    private ImpresoraInterface servidor;

    /**
     * Constructor de la calse, asigna el servidor.
     * @param servidor el servidor del que nos apoyaremos para apuntar todos los métodos.
     */
    public ImpresoraProxy(ImpresoraInterface servidor){
        this.servidor = servidor;
    }

    /**
     * Implementación del método imprimir. sobrecarga el método imprimir() del servidor.
     * @param empleado una instancia de empleado.
     * @param documento un documento a imprimir.
     * @throws RemoteException en caso de error con el servidor.
     */
    @Override public void imprimir(Empleado empleado, Documento documento) throws RemoteException{
        System.out.println("Solicitud enviada para imprimir el documento: " + documento.getNombreDocumento());
        servidor.imprimir(empleado, documento);
    }

}