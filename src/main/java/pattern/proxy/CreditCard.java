package pattern.proxy;

public class CreditCard implements Payment {

    private Payment service;
    private CreditAccount account;

    public CreditCard(Payment service, CreditAccount account) {
        this.service = service;
        this.account = account;
    }

    @Override
    public boolean pay(Integer amount) {
        if (!account.isStatus()) return false;

        return service.pay(amount);
    }
}
