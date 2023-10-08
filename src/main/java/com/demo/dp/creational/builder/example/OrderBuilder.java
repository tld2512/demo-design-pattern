package main.java.com.demo.dp.creational.builder.example;

import main.java.com.demo.dp.creational.builder.example.types.BreadType;
import main.java.com.demo.dp.creational.builder.example.types.OrderType;
import main.java.com.demo.dp.creational.builder.example.types.SauceType;
import main.java.com.demo.dp.creational.builder.example.types.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();

}
