package main.java.com.demo.dp.other.di.example.property_injection;

public class CustomerService {
    CustomerBusinessLogic customerBusinessLogic;

    public CustomerService(CustomerDataAccess cda) {
        //inject
        customerBusinessLogic = new CustomerBusinessLogic(cda);
    }

    public String getCustomerName(String id) {
        return customerBusinessLogic.processCustomerName(id);
    }
}
