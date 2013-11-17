package javarmiscript;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ContratoServico extends Remote {
	ArrayList<String> ExibeNomes() throws RemoteException;

	void InsereNome(String nome) throws RemoteException;

	void RemoveNome(String nome) throws RemoteException;
}
