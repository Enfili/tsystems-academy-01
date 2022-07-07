public class PointsTest {
    public static void main(String[] jahoda) {
        Point p1 = new Point(3, 4);
        Point p2 = p1;

        p1.move(10, 10);
        System.out.println(p2);

        int i1 = 3;
        int i2 = i1;
        i1 = i1 + 1;
        System.out.println(i1);
        System.out.println(i2);
    }
}
