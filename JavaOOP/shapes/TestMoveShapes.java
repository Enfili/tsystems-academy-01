package shapes;

public class TestMoveShapes {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Line(4),
            new Line(7, '#'),
        };

        print(shapes);
//        move(shapes, 1, 1);
//        print(shapes);
    }

//    private static void move(Shape[] shapes, int dx, int dy) {
//        for (Shape shape : shapes) {
//            shape.move(dx, dy);
//        }
//    }

    private static void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
