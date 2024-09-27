package mx.unam.ciencias.modelado.practica4.proxy;

import mx.unam.ciencias.modelado.practica4.empresa.Empleado;
import mx.unam.ciencias.modelado.practica4.empresa.Documento;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**Interfaz del patrón proxy. */
public interface ImpresoraInterface extends Remote{

    /**
     * Método principal de la interfaz, para imprimir un documento.
     * @param empleado una instancia de empleado.
     * @param documento una instancia de documento.
     * @throws RemoteException en caso de errores con el server remoto.
     */
    public void imprimir(Empleado empleado, Documento documento) throws RemoteException;
}