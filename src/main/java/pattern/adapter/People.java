package pattern.adapter;

public class People implements HumanInterface {

    @Override
    public String eat() {
        return "This creature need eat";
    }

    @Override
    public String die() {
        return "This creature will die";
    }
}
