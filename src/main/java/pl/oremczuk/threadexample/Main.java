package pl.oremczuk.threadexample;

public class Main {
    public static void main(String[] args) {

        ThreadEx thrd = new ThreadEx("Thread 1");
        ThreadEx2 thrd2 = new ThreadEx2("Thread 2");

        Thread thread = Thread.currentThread();

        do {

            try {
                for (int i = 0; i < 20; i++) {
                    System.out.println(thread.getName() + " thread goes to sleep");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                System.out.println(thread.getName() + " is suddenly up");
            }

        } while (thrd.thread.isAlive() || thrd2.isAlive());
    }
}
