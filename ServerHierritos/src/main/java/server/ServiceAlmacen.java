package server;

import clases.Usuario;
import interfaces.RMIAlmacen;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class ServiceAlmacen extends UnicastRemoteObject implements RMIAlmacen {

    private boolean sesionIniciada = false;
    private Usuario user=new Usuario(Usuario.TipoUsuario.BODEGUERO,"Paola","1234");

    public ServiceAlmacen() throws RemoteException {
    }

    @Override
    public boolean iniciarSesion(String usuario, String contrasena) throws RemoteException {
        if(user.getNombreUsuario().equals(usuario)&&user.getContrasena().equals(contrasena)&&user.getTipoUsuario().equals(Usuario.TipoUsuario.BODEGUERO)){
            return true;
        }
        return false;
    }

    @Override
    public boolean buscarProveedor(String nit) throws RemoteException {
        if(nit.equals("1234567")){
            return true;
        }
        return false;
    }

}
