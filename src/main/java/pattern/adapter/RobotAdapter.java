package pattern.adapter;

public class RobotAdapter implements HumanInterface {

    private final Robot robot;

    public RobotAdapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String eat() {
        return robot.charge();
    }

    @Override
    public String die() {
        return robot.shutdown();
    }
}
