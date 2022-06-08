package pattern.facade;

import java.util.List;

public class Customer {

    private final String name;

    private final List<Address> addresses;

    public Customer(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
