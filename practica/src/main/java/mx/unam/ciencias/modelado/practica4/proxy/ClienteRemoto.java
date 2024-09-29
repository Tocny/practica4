package mx.unam.ciencias.modelado.practica4.proxy;

import mx.unam.ciencias.modelado.practica4.empresa.*;
import mx.unam.ciencias.modelado.practica4.simulacion.*;
import java.rmi.RemoteException;
import java.rmi.Naming;

/**
 * Clase cliente remoto que nos servirá para emplear el proxy e inicializar al servidor remoto
 * así como para desarrollar las funciones generales del programa.
 */
public class ClienteRemoto{

    /**
     * Método main para ejecutar el menu completo de acciones que puede realizar el programa.
     * Hace las siguientes cosas:
     * 1. Busca la conexión con el servidor remoto mediante la ip, ojo que el servidor debe estár prendido para ello.
     * 2. Crea la instancia de proxy que se usará para mandar solicitudes al servidor.
     * 3. Pide datos al empleado, así como los datos del documento que desea imprimir, puede imprimi indefinidamente.
     * @param args un arreglo de argumentos.
     */
    public static void main(String[] args){
        try{
            ImpresoraInterface servidor = (ImpresoraInterface) Naming.lookup("rmi://localhost/ImpresoraServidor");

            ImpresoraProxy proxy = new ImpresoraProxy(servidor);

            MenuEmpleado menuEmpleado = new MenuEmpleado();
            Empleado empleado = menuEmpleado.construyeEmpleado();

            MenuDocumento menuDocumento = new MenuDocumento();

            while(true){
                Documento documento = menuDocumento.construyeDocumento();
                proxy.imprimir(empleado, documento);
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}