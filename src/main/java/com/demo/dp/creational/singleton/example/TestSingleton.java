package main.java.com.demo.dp.creational.singleton.example;

public class TestSingleton {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton);
        System.out.println(billPughSingleton2);
    }
}
