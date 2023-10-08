package main.java.com.demo.dp.other.di.example.constructor_injection;

public class CustomerBusinessLogic {
    ICustomerDataAccess dataAccess;

    public CustomerBusinessLogic(ICustomerDataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public CustomerBusinessLogic() {
        this.dataAccess = new CustomerDataAccess();
    }

    public String processCustomerName(String accountId) {
        return dataAccess.getCustomerName(accountId);
    }
}
