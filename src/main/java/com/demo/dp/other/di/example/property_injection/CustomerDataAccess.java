package main.java.com.demo.dp.other.di.example.property_injection;

public class CustomerDataAccess implements ICustomerDataAccess {
    public CustomerDataAccess() {}
    @Override
    public String getCustomerName(String accountId) {
        return "Get customer name of account " + accountId;
    }
}
