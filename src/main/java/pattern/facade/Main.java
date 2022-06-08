package pattern.facade;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Jl. nangka");
        Address address2 = new Address("Jl. durian");
        Customer andi = new Customer("Andi", List.of(address1, address2));

        CustomerFacade customerFacade = new CustomerFacade();
        customerFacade.insert(andi);
    }
}
