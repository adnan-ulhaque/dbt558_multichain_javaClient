package multichain;
import multichain.command.CommandElt;
import multichain.command.CommandManager;
import multichain.command.RuntimeParameters;

public class dbt558 {
    public static void main(String[] args) {
        Object getInfo; 

        RuntimeParameters Param=new RuntimeParameters();
        //below directory path is %AppData% path in windows file explorer
        Param.setDatadir("C:\\Users\\adnan\\AppData\\Roaming\\MultiChain\\");
        Param.setRpcport("6756");//This port should be copy/pasted from the output of multichaind <multichian-name> --daemon

        //copy/paste rpcuser/rpcpassword from C:\Users\adnan\AppData\Roaming\MultiChain\tutchain\multichain.conf (\%AppData%\MultiChain\<your multichain_name>\multichain.conf)
        CommandManager CM=new CommandManager("localhost", "6756", "multichainrpc", "9UhZQQy8ZgaVZZbHtJkcXRVUdqzPAsLk9DPNCVAJy1UJ");

        try {
            getInfo=CM.invoke(CommandElt.GETINFO);

            System.out.println(getInfo);
        } catch (Exception e) {
            System.out.println(e);    
        }
            
        
    }
}
