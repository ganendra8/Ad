import HelloApp.*;
import org.omg.CORBA.*;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        try {
            // Setup ORB properties before initialization
            Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", "1050");
            // Optionally specify host if needed:
            props.put("org.omg.CORBA.ORBInitialHost", "localhost");  //Here "localhost" is needed
            // Initialize ORB once with properties
            ORB orb = ORB.init(args, props);

            // Paste the IOR string printed by server here
            String ior = "IOR:000000000000001749444c3a48656c6c6f4170702f48656c6c6f3a312e300000000000010000000000000086000102000000000d3139322e3136382e312e36390000da2900000031afabcb00000000203b5a381800000001000000000000000100000008526f6f74504f410000000008000000010000000014000000000000020000000100000020000000000001000100000002050100010001002000010109000000010001010000000026000000020002"; 
			
        // Convert string back to CORBA object
        org.omg.CORBA.Object obj = orb.string_to_object(ior);

        //ncRef.rebind(ncRef.to_name("Hello"), href);
        Hello helloRef = HelloHelper.narrow(obj);

         String response = helloRef.sayHello();
         System.out.println("Server says: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
