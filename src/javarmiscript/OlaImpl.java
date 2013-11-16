package javarmiscript;

import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 

public class OlaImpl extends UnicastRemoteObject implements testeola { 

    // precisamos definir um construtor pois o default n�o gera RemoteException 
    public OlaImpl() throws RemoteException { 
       super(); 
    } 

    public String showMsg(String msg) { 
        // note que n�o tem o throws aqui. A exce��o � gerada pela super-classe se for o caso 

        System.out.println("msg: " + msg);
        return("msg enviada- o cliente tem notifica��o de recebimento");
	// caso queira passar algum par�metro para o cliente.
    } 

    public static void main(String args[]) { 

        try { 
            // aqui criamos o objeto que sera acessado remotamente
            OlaImpl obj = new OlaImpl();

            // Aqui registramos o objeto obj como "OlaServidor" no servidor, da-se um nome a interface
            Naming.rebind("OlaServidor", obj); 

            System.out.println("Servidor carregado no registry"); 
        } catch (Exception e) { 
            System.out.println("OlaImpl erro: " + e.getMessage()); 
            e.printStackTrace(); 
        } 
    } 
} 
