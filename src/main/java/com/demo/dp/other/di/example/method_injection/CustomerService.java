package main.java.com.demo.dp.other.di.example.method_injection;

import main.java.com.demo.dp.other.di.example.property_injection.CustomerDataAccess;

public class CustomerService {
    CustomerBusinessLogic customerBusinessLogic;

    public CustomerService() {
        customerBusinessLogic = new CustomerBusinessLogic();
        customerBusinessLogic.setDependency(new CustomerDataAccess());
    }

    public String getCustomerName(String accountId) {
        return customerBusinessLogic.getCustomerName(accountId);
    }
}
