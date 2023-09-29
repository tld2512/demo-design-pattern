package main.java.com.demo.dp.creational.singleton;

public class BillPughSingleton {
    private static class SingletonHelper {
        static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton() { }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
