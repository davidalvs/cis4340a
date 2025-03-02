import java.io.*;

public class R13_FIO02_J {
    public static void readFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } // FileReader and BufferedReader are automatically closed
    }
}

