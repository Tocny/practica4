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
        System.out.println("Conexión con el servidor ctOS establecida. Ingrese los documentos que desee imprimir.");
    }

    /**
     * Implementación del método imprimir. sobrecarga el método imprimir() del servidor.
     * @param empleado una instancia de empleado.
     * @param documento un documento a imprimir.
     * @throws RemoteException en caso de error con el servidor.
     */
    @Override public void imprimir(Empleado empleado, Documento documento) throws RemoteException{
        if(gestionarPermisos(empleado, documento) == true){
            System.out.println("Solicitud enviada para imprimir el documento: " + documento.getNombreDocumento());
        } else{
            System.out.println(empleado.getNombre() + ", usted no puede imprimir a color.");
        }

        servidor.imprimir(empleado, documento);
    }

    /**
     * Método que sobrecarga la gestion de permisos al de los del servidor.
     * @param empleado una instancia de empleado.
     * @param documento una instancia de documento.
     * @throws RemoteException en caso de errores con el server remoto.
     */
    @Override public boolean gestionarPermisos(Empleado empleado, Documento documento) throws RemoteException{
        return servidor.gestionarPermisos(empleado, documento);
    }

}