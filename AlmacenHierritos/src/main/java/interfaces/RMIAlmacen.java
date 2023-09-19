package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIAlmacen extends Remote {
    public boolean iniciarSesion(String usuario, String contrasena) throws RemoteException;

    public boolean buscarProveedor(String nit) throws RemoteException;

}
