package main.java.com.demo.dp.other.di.example.property_injection;

public class TestPI {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService(new CustomerDataAccess());
        System.out.println(cs.getCustomerName("ahihi123"));;
    }
}
