package pattern.facade;

public class CustomerFacade {

    private final CustomerRepository customerRepository;
    private final AddressRepository addressRepository;

    public CustomerFacade() {
        this.customerRepository = new CustomerRepository();
        this.addressRepository = new AddressRepository();
    }

    void insert(Customer customer) {
        customerRepository.save(customer);

        for (Address address : customer.getAddresses()) {
            addressRepository.save(address);
        }
    }
}
