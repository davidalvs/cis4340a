public class R09_LCK01_J {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void doSomething() {
        synchronized (lock1) {
            System.out.println("Acquired lock1.");
            synchronized (lock2) {
                System.out.println("Acquired lock2.");
            }
        }
    }
}

