package shapes;

import java.util.Random;

public class TestShapes {
    
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(5),
                new Rectangle(3, 6),
                new Triangle('J', 8),
                new Circle(11),
                new Parallelogram(4)
        };

        Random r = new Random();
        for (Shape shape: shapes) {
            shape.move(r.nextInt(10), r.nextInt(10));
            System.out.println(shape);
        }

//        Square sq = new Square(4);
//        System.out.println(sq);

//        Parallelogram p = new Parallelogram(5);
//        p.move(4, 0);
//        System.out.println(p);

//        Circle c = new Circle(3);
//        System.out.println(c);


//        Point point1 = new Point(0,0);
//        Point point2 = new Point(10,10);
//        Line line = new Line(point1, point2);
//        Shape point3 = new Point(2, 3);
//
//        System.out.println("P1: " + point1.toString());
//        System.out.println("L : " + line.toString());
//        line.move(5, 5);
//        System.out.println("L : " + line.toString());
//        System.out.println("P1: " + point1.toString());
//        point3.move(10, 10);
//        System.out.println("P3: " + point3.toString());
    }
}
