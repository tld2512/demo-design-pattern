package main.java.com.demo.dp.other.di.example.constructor_injection;

public class CustomerDataAccess implements ICustomerDataAccess{
    @Override
    public String getCustomerName(String accountId) {
        return "Get customer name of account " + accountId;
    }
}
