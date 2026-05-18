import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;

public class URLTest {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://phet-dev.colorado.edu/html/build-an-atom/0.0.0-3/simple-text-only-test-page.html");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

   InputStream input = connection.getInputStream();


         int data;
         while((data = input.read()) != -1) {
            System.out.print((char)data);
         }

         input.close();
     }
 }
