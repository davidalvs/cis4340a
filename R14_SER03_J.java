import java.io.*;

public class R14_SER03_J implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient String sensitiveData = "123456";

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        if (sensitiveData == null || sensitiveData.length() > 20) {
            throw new InvalidObjectException("Invalid data detected.");
        }
    }
}

