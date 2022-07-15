package shapes;

public class Parallelogram extends Shape {
    private int height;

    public Parallelogram(int height) {
        this.height = height;
    }

    public Parallelogram(char color, int height) {
        super(color);
        this.height = height;
    }

    @Override
    public String toString() {
        String s = "";

        int x = getX();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < height - j + x; i++) {
                s += " ";
            }
            for (int i = 0; i < height; i++) {
                s += super.color;
            }
            s += "\n";
        }

        return s;
    }

    @Override
    public void print() {

    }
}
