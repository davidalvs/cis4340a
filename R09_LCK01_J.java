public class R09_LCK01_J {
    private static final Object lock = new Object();
    
    public void doSomething() {
        synchronized (lock) {
            System.out.println("Acquired lock.");
            // Perform an operation
            synchronized (lock) {
                System.out.println("Acquired lock again (risk of deadlock).");
            }
        }
    }
}
