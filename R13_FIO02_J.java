import java.io.*;

public class R13_FIO02_J {
    public static void readFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        // FileReader not closed (resource leak)
    }
}
