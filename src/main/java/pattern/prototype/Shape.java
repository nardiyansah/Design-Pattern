package pattern.prototype;

public class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public Shape(Shape source) {
        this.color = source.color;
    }

    protected Shape clone() {
        return new Shape(this);
    }
}
