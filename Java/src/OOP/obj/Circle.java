package OOP.obj;

public class Circle {
    public static final double DEFAULT_RADIUS = 3.0;
    public static final String DEFAULT_COLOR = "Black";

    private double radius;
    private String color;

    public Circle(){
        radius = DEFAULT_RADIUS;
        color = DEFAULT_COLOR;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = DEFAULT_COLOR;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(5, "Red");
        Circle circle3 = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
        circle.setColor("Green");
        System.out.println(circle.getColor());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
    }
}
