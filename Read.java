import java.io.FileReader;
import java.io.IOException;

public class Read {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("output.txt");

        int data;

        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }

        reader.close();
    }
}