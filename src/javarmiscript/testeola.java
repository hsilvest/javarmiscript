package javarmiscript;

import java.rmi.Remote; 
import java.rmi.RemoteException; 

public interface testeola extends Remote { 
    String showMsg(String msg) throws RemoteException; 
}
