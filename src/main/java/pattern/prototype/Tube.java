package pattern.prototype;

public class Tube extends Circle {

    private Integer height;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Tube() {
    }

    public Tube(Integer height) {
        this.height = height;
    }

    public Tube(Tube source) {
        super(source);
        this.height = source.height;
    }

    public Tube clone() {
        return new Tube(this);
    }
}
