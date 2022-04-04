package pl.oremczuk.threadexample;

public class ThreadEx implements Runnable {

    Thread thread;

    ThreadEx (String name) {

        thread = new Thread(this, name);
        thread.start();

    }
    @Override
    public void run() {

        System.out.println(thread.getName() + " reached " + Service.getInstance());

        try {
            for (int i=0; i<10; i++) {
                System.out.println(thread.getName() + " goes to sleep");
                Thread.sleep(150);

            }
        }
        catch (InterruptedException e) {
            System.out.println(thread.getName() + " is suddenly up");
        }

    }
}
