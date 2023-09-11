package second_task;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(5.7, 2.3);
        System.out.println(b);
        b.move(6, -6);
        System.out.println(b);
    }
}
