package main.java.com.demo.dp.creational.singleton.example;

public class StaticBlockSingleton {
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            //handle exception
            throw new RuntimeException(e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
