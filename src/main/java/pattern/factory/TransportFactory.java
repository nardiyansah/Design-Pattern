package pattern.factory;

public class TransportFactory {

    public static Transport createTransport(String type) {
        switch (type) {
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            default:
                return new DefaultTransport();
        }
    }
}
