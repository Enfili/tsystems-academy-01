package shapes;

public abstract class Shape implements Comparable<Shape> {
    protected char color;
    private int x;
    private int y;

    public Shape() {
        this('*');
    }

    public Shape(char color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;

        for (int j = 0; j < y; j++)
            System.out.println();
    };

    public abstract void print();

    @Override
    public int compareTo(Shape o) {
        return this.color - o.getColor();
    }
}
