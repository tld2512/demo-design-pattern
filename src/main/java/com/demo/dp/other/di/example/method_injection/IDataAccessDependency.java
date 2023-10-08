package main.java.com.demo.dp.other.di.example.method_injection;

import main.java.com.demo.dp.other.di.example.property_injection.ICustomerDataAccess;

public interface IDataAccessDependency {
    void setDependency(ICustomerDataAccess customerDataAccess);
}
