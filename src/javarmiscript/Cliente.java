package javarmiscript;

import java.rmi.Naming; 

public class Cliente { 

    public static void main(String[] args) { 
        
        /*
         * obj é o identificador utilizado para fazer referência ao objeto remoto que será implementado
         */
        testeola obj = null; 

        String msg = "aqui esta a mensagem que será passada para o servidor";
        String retorno = null;
        
        try { 
            /*
             * - o lookup carrega o OlaImpl_Stub do CLASSPATH 
             * - 127.0.0.1 é o IP da máquina onde está o servidor, no nosso caso é a mesma máquina, mas pode ser a máquina do colega
             * - OlaServidor é o nome que utilizamos para fazer referência ao objeto no servidor
             */ 


            // aqui instanciamos o objeto remoto
            obj = (testeola)Naming.lookup("//127.0.0.1/OlaServidor"); 

            // agora executamos o método showMsg no objeto remoto
            retorno = obj.showMsg(msg);
            System.out.println(retorno);
        } 
	// Aqui trata-se as exceções presentes
        catch (Exception e) { 
            System.out.println("Client exception: " + e.getMessage()); 
            e.printStackTrace(); 
        }  
    } 
}
