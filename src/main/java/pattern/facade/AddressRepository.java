package pattern.facade;

public class AddressRepository {

    void save(Address address) {
        System.out.println("Save address with " + address.getStreet() + " street to database");
    }
}
