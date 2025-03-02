public class R07_ERR08_J {
    public static void main(String[] args) {
        try {
            System.out.println("Processing...");
            throw new Exception();
        } catch (Exception e) {
            // This hides the error and does nothing
        }
    }
}
