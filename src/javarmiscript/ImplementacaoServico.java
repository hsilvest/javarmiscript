package javarmiscript;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ImplementacaoServico extends UnicastRemoteObject implements
		ContratoServico {

	public static ArrayList<String> nomes = new ArrayList<String>();

	public ImplementacaoServico() throws RemoteException {
		super();
	}

	@Override
	public ArrayList<String> ExibeNomes() throws RemoteException {
		return nomes;
	}

	@Override
	public void InsereNome(String nome) throws RemoteException {
		nomes.add(nome);
	}

	@Override
	public void RemoveNome(String nome) throws RemoteException {
		nomes.remove(nome);
	}
}
