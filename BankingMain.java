public class BankingMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer(101, "John Doe");
        Customer customer2 = new Customer(102, "Jane Smith");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        System.out.println("Bank Details: " + bank);

        Customer fetchedCustomer = bank.getCustomer(101);
        System.out.println("Fetched Customer: " + fetchedCustomer);
    }
}
