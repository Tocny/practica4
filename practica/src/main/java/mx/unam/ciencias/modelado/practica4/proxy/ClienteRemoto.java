package mx.unam.ciencias.modelado.practica4.proxy;

import mx.unam.ciencias.modelado.practica4.empresa.*;
import mx.unam.ciencias.modelado.practica4.simulacion.*;
import java.rmi.RemoteException;
import java.rmi.Naming;

public class ClienteRemoto{
    public static void main(String[] args){
        try{
            ImpresoraInterface servidor = (ImpresoraInterface) Naming.lookup("rmi://192.168.1.19/ImpresoraServidor");

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