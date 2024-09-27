package mx.unam.ciencias.modelado.practica4.singleton;

import mx.unam.ciencias.modelado.practica4.empresa.*;
import mx.unam.ciencias.modelado.practica4.proxy.ImpresoraInterface;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Clase impresora servidor para el patrón proxy y singleton.
 * implementa la interfaz ImpresoraInterface para hacer la logica general de las impresiones remotas.
 */
public class ImpresoraServidor extends UnicastRemoteObject implements ImpresoraInterface{

    /**El serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /**Instancia unica de la clase */
    private static ImpresoraServidor instancia;
    /**Cola para las impresiones. */
    private Queue<Documento> impresiones;
    /**Limite de impresiones que se pueden acumular en la cola. */
    private static final int MAXIMO_COLA = 3;

    /**
     * Constructor de la clase inicializa la cola de impresiones.
     * @throws RemoteException por si acaso.
     */
    private ImpresoraServidor() throws RemoteException{
        impresiones = new ConcurrentLinkedQueue<>();
    }

    /**
     * Método para el patrón singleton, regresa la instancia unica de la clase.
     * @return el atributo instancia.
     * @throws RemoteException por si acaso.
     */
    public static ImpresoraServidor getInstancia() throws RemoteException{
        if(instancia == null){
            instancia = new ImpresoraServidor();
        }
        return instancia;
    }

    /**
     * Método para imprimir un documento de empleado o agregarlo a la cola de impresiones.
     * @param empleado una instancia de empleado.
     * @param documento una instancia de documento.
     * @throws RemoteException por si acaso.
     */
    @Override public void imprimir(Empleado empleado, Documento documento) throws RemoteException{
        if(gestionarPermisos(empleado, documento)){
            documento.setAutor(empleado.getNombre());
            impresiones.add(documento);
            System.out.println("Solicitud recibida, se imprimirá el documento: " + documento.getNombreDocumento());
        } else{
            System.out.println(empleado.getNombre() + ", usted no puede imprimir a color.");
        }
        
        //Si se revasa el máximo, se hacen las impresiones y se hace un shut down al programa.
        if(impresiones.size() >= MAXIMO_COLA){
            realizaImpresiones();
        }
        
    }

    /**
     * Método que valida los permisos del empleado a imprimir a color el documento.
     * @param empleado una instancia de empleado.
     * @param documento una instancia de documento.
     * @return si el documento está marcado a ser a color y el area de trabajo del empleado es Mercadotecnia tienen valores booleanos iguales.
     */
    private boolean gestionarPermisos(Empleado empleado, Documento documento){
        boolean esDeMercadotecnia = empleado.getArea().equals(AreaDeTrabajo.MERCADOTECNIA);
        boolean documentoAColor = documento.getEsAColor();

        if((documentoAColor == false) && esDeMercadotecnia == true){
            return true;
        } 

        return esDeMercadotecnia == documentoAColor;
    }

    /**
     * Método que vacía la cola realizando las impresiones.
     * Se escribió para denotar que se recorre la cola de impresiones.
     */
    private void realizaImpresiones(){
        while(!impresiones.isEmpty()){
            Documento documento = impresiones.poll();
            System.out.println("Imprimiendo documento: " + documento.getNombreDocumento() +  " Solicitado por: " + documento.getAutor());
            System.out.println(documento.getContenido());
        }
    }

    /**
     * Método main de la clase, inicializa el servidor mediante rmi.
     * @param args un arreglo de argumentos.
     */
    public static void main(String[] args){
        try{
            System.setProperty("java.net.preferIPv4Stack", "true");
            System.setProperty("java.rmi.server.hostname", "192.168.1.3");
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://192.168.1.3/ImpresoraServidor", getInstancia());
            System.out.println("Servidor registrado");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}