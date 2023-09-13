package second_task;

public class Circle extends Point implements Comparable {
    private double radius;

    public Circle() {
        super(0, 0);
        this.radius = 1.0;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getSquare(){
        return Math.pow(radius, 2) * 3.14;
    }

    public double circleLong(){
        return 2 * (radius * 3.14);
    }

    @Override
    public String toString() {
        return "X: " + super.getX() + "\n" +
                "Y: " + super.getY() + "\n" +
                "Radius: " + radius + "\n";
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle) o;
        return Double.compare(this.getSquare(), c.getSquare());
    }
}