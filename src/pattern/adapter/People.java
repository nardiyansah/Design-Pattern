package pattern.adapter;

public class People implements HumanInterface {

    @Override
    public void eat() {
        System.out.println("This creature need eat");
    }

    @Override
    public void die() {
        System.out.println("This creature will die");
    }
}
