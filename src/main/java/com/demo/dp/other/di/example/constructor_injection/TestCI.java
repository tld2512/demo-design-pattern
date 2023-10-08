package main.java.com.demo.dp.other.di.example.constructor_injection;

public class TestCI {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        System.out.println(cs.getCustomerName("12345"));;
    }
}
