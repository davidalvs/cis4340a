public class R07_ERR08_J {
    public static void main(String[] args) {
        try {
            System.out.println("Processing...");
            throw new Exception();
        } catch (Exception e) {
            // Secure fix: Log the error instead of hiding it
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}

