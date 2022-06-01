package pattern.prototype;

public class Circle extends Shape {

    private Integer radius;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    protected Circle clone() {
        return new Circle(this);
    }
}
