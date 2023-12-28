import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Customer> customers;

    public Bank() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    @Override
    public String toString() {
        return "Bank [customers=" + customers + "]";
    }
}
