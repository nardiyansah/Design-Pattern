package pattern.proxy;

public class CreditAccount {

    private String name;
    private boolean status;

    public CreditAccount(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }
}
