package main.java.com.demo.dp.other.di.example.method_injection;

public class TestMI {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        System.out.println(cs.getCustomerName("Hello darkness from the other side"));;
    }
}
