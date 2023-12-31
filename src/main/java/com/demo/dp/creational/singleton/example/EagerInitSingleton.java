package main.java.com.demo.dp.creational.singleton.example;

public class EagerInitSingleton {
    private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static EagerInitSingleton getInstance() {
        return INSTANCE;
    }
}
