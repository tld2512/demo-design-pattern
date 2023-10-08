package main.java.com.demo.dp.creational.builder.example;

import main.java.com.demo.dp.creational.builder.example.types.BreadType;
import main.java.com.demo.dp.creational.builder.example.types.OrderType;
import main.java.com.demo.dp.creational.builder.example.types.SauceType;
import main.java.com.demo.dp.creational.builder.example.types.VegetableType;

public class Client {
    public static void main(String[] args) {
        Order newOrder = new FastFoodOrderBuilder()
                .orderType(OrderType.TAKE_AWAY)
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.KETCHUP)
                .orderVegetable(VegetableType.SALAD)
                .build();

        System.out.println(newOrder);
    }
}
