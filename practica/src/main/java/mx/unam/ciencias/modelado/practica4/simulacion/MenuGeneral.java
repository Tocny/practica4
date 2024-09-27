package mx.unam.ciencias.modelado.practica4.simulacion;

import mx.unam.ciencias.modelado.practica4.empresa.*;
import mx.unam.ciencias.modelado.practica4.proxy.*;
import mx.unam.ciencias.modelado.practica4.singleton.ImpresoraServidor;
import java.rmi.RemoteException;


/**Clase de menu general para que el usuario proporcione los datos necesarios para imprimir su documento. */
public class MenuGeneral{

    /**El empleado que representa el usuario. */
    private Empleado empleado;
    /**El documento que ha de imprimirse. */
    private Documento documento;
    /**Instancia del proxy. */
    private ImpresoraInterface proxy;

    /**Constructor de la clase, inicializa el proxy y crea el empleado. */
    public MenuGeneral(){
        try{
            proxy = new ImpresoraProxy(ImpresoraServidor.getInstancia());

            MenuEmpleado menuEmpleados = new MenuEmpleado();
            empleado = menuEmpleados.construyeEmpleado();

        }catch(RemoteException e){
            System.err.println(e.getMessage());
        }
    }

    /** Método que solicita los datos del usuario crear un documento. */
    public void solicitaDocumento(){
        MenuDocumento menuDocumentos = new MenuDocumento();
        documento = menuDocumentos.construyeDocumento();
    }

    /**Método que manda llamar el método imprimir() del proxy. */
    public void solicitaImpresion(){
        try{
            proxy.imprimir(empleado, documento);
        }catch(RemoteException e){
            System.err.println(e.getMessage());
        }
    }
}