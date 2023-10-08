package main.java.com.demo.dp.other.di.example.constructor_injection;

public class CustomerService {

    CustomerBusinessLogic customerBusinessLogic;

    //injection constructor
    public CustomerService() {
        customerBusinessLogic = new CustomerBusinessLogic(new CustomerDataAccess());
    }

    public String getCustomerName (String accountId) {
        return customerBusinessLogic.processCustomerName(accountId);
    }
}
