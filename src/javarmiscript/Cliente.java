package javarmiscript;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class Cliente {

	public static void main(String[] args) {

		try {
			ContratoServico obj = (ContratoServico) Naming
					.lookup("rmi://localhost:1099/Service");
			
			while (true) {
				System.out.println();
				System.out.println("******************************");
				System.out.println("*   Agenda de Contatos RMI   *");
				System.out.println("*----------------------------*");
				System.out.println("******************************");
				System.out.println("*----------------------------*");
				System.out.println("*- Digite o Comando Desejado *");
				System.out.println();
				System.out.println("------------------------------");
				System.out.println("1 : Inserir Registro");
				System.out.println("------------------------------");
				System.out.println("2 : Remover Registro");
				System.out.println("------------------------------");
				System.out.println("3 : Exibir Registros");
				System.out.println("------------------------------");
				System.out.println("4 : Sair");
				System.out.println("------------------------------");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				String key = br.readLine();

				switch (key) {
				case "1":
					System.out.println("Digite o nome a ser inserido");
					obj.InsereNome(br.readLine());
					System.out.println("Nome inserido com sucesso");
					break;
				case "2":
					System.out.println("Digite o nome a ser removido");
					obj.RemoveNome(br.readLine());
					System.out.println("Nome removido com sucesso");
					break;
				case "3":
					for (String nome : obj.ExibeNomes()) {
						System.out.println("** Nomes encontrados: **");
						System.out.println("** " + nome + " **");
					}
					
					break;
				case "4":
					System.exit(0);
					break;
				default:
					System.out.println("Digite um valor valido");
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
