import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {

   public CalculatorServer() {  // Constructor for creating and registering CalculatorServer
     try {
          Calculator c = new CalculatorImpl();  // Create an instance of the object to be served remotely
          
          LocateRegistry.createRegistry(1099); // Create a remote object registry (rmiregistry) in the same JavaVM as this app
                                               // that accepts calls on port 1099 or alternatively "start rmiregistry" and set codebase 
          									   // for stub class access outside of this app

          Naming.rebind("rmi://localhost:1099/CalculatorService", c);  // Register the service object c with the rmiregistry 
          															   // under the name "CalculatorService"

     }   catch (Exception e) {
               System.out.println("Trouble: " + e);
         }
}


public static void main(String args[]) {  // Execution of server side application begins here
     new CalculatorServer();
     System.out.println("Calculator Server Running");
    }
}

