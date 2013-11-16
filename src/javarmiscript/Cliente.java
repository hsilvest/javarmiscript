package javarmiscript;

import java.rmi.Naming; 

public class Cliente { 

    public static void main(String[] args) { 
        
        /*
         * obj � o identificador utilizado para fazer refer�ncia ao objeto remoto que ser� implementado
         */
        testeola obj = null; 

        String msg = "aqui esta a mensagem que ser� passada para o servidor";
        String retorno = null;
        
        try { 
            /*
             * - o lookup carrega o OlaImpl_Stub do CLASSPATH 
             * - 127.0.0.1 � o IP da m�quina onde est� o servidor, no nosso caso � a mesma m�quina, mas pode ser a m�quina do colega
             * - OlaServidor � o nome que utilizamos para fazer refer�ncia ao objeto no servidor
             */ 


            // aqui instanciamos o objeto remoto
            obj = (testeola)Naming.lookup("//127.0.0.1/OlaServidor"); 

            // agora executamos o m�todo showMsg no objeto remoto
            retorno = obj.showMsg(msg);
            System.out.println(retorno);
        } 
	// Aqui trata-se as exce��es presentes
        catch (Exception e) { 
            System.out.println("Client exception: " + e.getMessage()); 
            e.printStackTrace(); 
        }  
    } 
}
