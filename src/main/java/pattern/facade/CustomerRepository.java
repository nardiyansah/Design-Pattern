package pattern.facade;

public class CustomerRepository {

    void save(Customer customer) {
        System.out.println("Save customer " + customer.getName() + " to database");
    }
}
