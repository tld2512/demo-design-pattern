package main.java.com.demo.dp.other.di.example.property_injection;


public class CustomerBusinessLogic {
    //inject field
    public ICustomerDataAccess dataAccess;

    public CustomerBusinessLogic(CustomerDataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public String processCustomerName(String accountId) {
        return dataAccess.getCustomerName(accountId);
    }
}
