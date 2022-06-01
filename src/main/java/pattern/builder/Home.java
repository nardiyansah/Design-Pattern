package pattern.builder;

public class Home {

    private Integer walls;
    private Boolean swimmingPool;
    private Boolean fence;

    public static Home buildHome() {
        return new Home();
    }

    public Home buildWalls(Integer numberWalls) {
        this.walls = numberWalls;
        return this;
    }

    public Home buildSwimmingPool() {
        this.swimmingPool = true;
        return this;
    }

    public Home buildFence() {
        this.fence = true;
        return this;
    }

    public Integer getWalls() {
        return walls;
    }

    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public Boolean getFence() {
        return fence;
    }
}
