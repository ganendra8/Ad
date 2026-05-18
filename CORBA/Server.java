import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import java.util.Properties;

public class Server {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", "1050");

            //Initialize ORB once with properties
            ORB orb = ORB.init(args, props);

            // Get Root POA and activate manager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

            // Create HelloImpl object
            HelloImpl helloImpl = new HelloImpl();  //HelloImpl.java implemented
	    	org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);  

            //Register is already done here
            String ior = orb.object_to_string(ref);
	    	System.out.println("IOR: " + ior);
				
             System.out.println("CORBA Server is running...");

            // Wait for client requests
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
