package shapes;

public abstract class Shape {
    protected char color;

    public Shape() {
        this('*');
    }

    public Shape(char color) {
        this.color = color;
    }

//    public abstract void move(int dx, int dy);

    public int getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String toString() {
        return ": color = " + color;
    }
}
