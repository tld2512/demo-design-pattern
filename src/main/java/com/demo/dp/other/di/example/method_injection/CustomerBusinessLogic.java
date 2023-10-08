package main.java.com.demo.dp.other.di.example.method_injection;

import main.java.com.demo.dp.other.di.example.property_injection.ICustomerDataAccess;

public class CustomerBusinessLogic implements IDataAccessDependency{

    ICustomerDataAccess dataAccess;

    public CustomerBusinessLogic()
    {
    }

    public String getCustomerName(String id)
    {
        return dataAccess.getCustomerName(id);
    }

    //injection method
    @Override
    public void setDependency(ICustomerDataAccess customerDataAccess) {
        this.dataAccess = customerDataAccess;
    }
}
