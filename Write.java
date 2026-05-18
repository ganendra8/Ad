import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("output.txt");

            writer.write("Hello, this is first line\n");
            writer.write("This is second line\n");
            writer.write("FileWriter write() example in Java\n");

            writer.close();

            System.out.println("Data written successfully!");
        }

        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}