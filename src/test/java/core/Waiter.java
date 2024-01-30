package core;

public class Waiter {
    public static void waitWithThreadInterrupt(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
