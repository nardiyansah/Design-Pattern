package pattern.proxy;

public class Pay implements Payment {

    @Override
    public boolean pay(Integer amount) {
        System.out.println("Succes pay with amount: " + amount);
        return true;
    }
}
