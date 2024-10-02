package mx.unam.ciencias.modelado.practica4.proxy;

import mx.unam.ciencias.modelado.practica4.empresa.*;
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
     * 3. Hace una simulación generica.
     * @param args un arreglo de argumentos.
     */
    public static void main(String[] args){
        try{
            // Busca la conexión con el servidor remoto (puedes ajustar la IP si se ejecuta desde otra máquina).
            ImpresoraInterface servidor = (ImpresoraInterface) Naming.lookup("rmi://127.0.0.1/ImpresoraServidor");

            // Crea la instancia del proxy para interactuar con el servidor.
            ImpresoraProxy proxy = new ImpresoraProxy(servidor);

            // Simulación: Creación de empleados
            Empleado empleado1 = new Empleado("Juan Perez", "JUAP12345678", AreaDeTrabajo.DIRECCION, 5);
            Empleado empleado2 = new Empleado("Maria Lopez", "MALP98765432", AreaDeTrabajo.MERCADOTECNIA, 4);

            // Simulación: Creación de documentos
            Documento documento1 = new Documento("Reporte de Ventas", "Contenido del reporte de ventas.", true);
            Documento documento2 = new Documento("2do Reporte de Ventas OwO", "Segundo reporte de ventas.", false);
            Documento documento3 = new Documento("Plan de Proyecto", "Contenido del plan del proyecto.", true);

            // Imprimir documento 1
            proxy.imprimir(empleado1, documento1);
            proxy.imprimir(empleado1, documento2);
            // Imprimir documento 2
            proxy.imprimir(empleado2, documento3);

            System.exit(0);

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}