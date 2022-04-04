package pl.oremczuk.threadexample;

public class Service {

    private static volatile Service instance = null;

    private Service() {
        if (instance!= null) {
            throw new RuntimeException("Use getInstance() method");
        }
    }

    public static Service getInstance() {
        if (instance == null) {
            synchronized (Service.class) {
                if (instance == null) {
                    instance = new Service();
                }
            }
        }
        return instance;
    }

}
