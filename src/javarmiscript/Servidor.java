package javarmiscript;

import java.rmi.Naming;

public class Servidor {

	public Servidor() {
		try {
			ContratoServico obj = new ImplementacaoServico();
			Naming.rebind("rmi://localhost:1099/Service", obj);
			System.out.println("Servidor carregado no registry");
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		new Servidor();
	}

}
