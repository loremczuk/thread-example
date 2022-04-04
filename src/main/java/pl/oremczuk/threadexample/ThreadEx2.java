package pl.oremczuk.threadexample;

public class ThreadEx2 extends Thread {

    ThreadEx2 (String name) {
        super(name);
        start();

    }

    public void run() {

        setPriority(NORM_PRIORITY+3);
        System.out.println(getName() + " reached " + Service.getInstance());

        try {
            for (int i=0; i<10; i++) {
                System.out.println(getName() + " goes to sleep");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            System.out.println(getName() + " is suddenly up");
        }
    }

}
