package shapes;

public class Line extends Shape {
    int size;

    public Line(int size) {
        this.size = size;
    }

    public Line(int size, char color) {
        super(color);
        this.size = size;
    }

//    public Point getFrom() {
//        return from;
//    }
//
//    public Point getTo() {
//        return to;
//    }
//
//    public void move(int dx, int dy) {
//        getFrom().move(dx, dy);
//        getTo().move(dx, dy);
//    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += super.color;
        }
        return s;
//        if (getFrom() != null && getTo() != null) {
//            return "(" + getFrom().toString() + ") -> (" + getTo().toString() + ")" + super.toString();
//        }
//        return "? -> ?"  + super.toString();
    }

    @Override
    public void print() {

    }

//    @Override
//    public void print() {
//        toString();
//    }
}
