package main.java.com.demo.dp.creational.builder.example;

import main.java.com.demo.dp.creational.builder.example.types.BreadType;
import main.java.com.demo.dp.creational.builder.example.types.OrderType;
import main.java.com.demo.dp.creational.builder.example.types.SauceType;
import main.java.com.demo.dp.creational.builder.example.types.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder{
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
