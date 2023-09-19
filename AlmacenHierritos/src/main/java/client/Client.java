package client;

import interfaces.RMIAlmacen;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client implements RMIAlmacen {

    private RMIAlmacen service;
    private String ip;
    private String port;
    private String serviceName;
    private String url;

    public Client(String ip, String port, String serviceName){
        this.service = null;
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }

    @Override
    public boolean iniciarSesion(String usuario, String contrasena) throws RemoteException {
        try{
            service = (RMIAlmacen) Naming.lookup(url);
            return service.iniciarSesion(usuario,contrasena);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean buscarProveedor(String nit) throws RemoteException {
        try {
            service = (RMIAlmacen) Naming.lookup(url);
            return service.buscarProveedor(nit);
        }catch(MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }

    }
}
