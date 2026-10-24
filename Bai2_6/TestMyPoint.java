package Bai2.Bai2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);

        MyPoint p2 = new MyPoint(1, 2);
        System.out.println(p2);

        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p3 = new MyPoint(0, 4);

        System.out.printf("Distance from p1 to (0, 4) is: %.2f%n", p1.distance(0, 4));
        System.out.printf("Distance from p1 to p3 is: %.2f%n", p1.distance(p3));
        System.out.printf("Distance from p3 to origin (0,0) is: %.2f%n", p3.distance());
    }
}
