import java.security.SecureRandom;

public class R49_MSC61_J {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int secureNumber = secureRandom.nextInt();
        System.out.println("Secure random number: " + secureNumber);
    }
}
