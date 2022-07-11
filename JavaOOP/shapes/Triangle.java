package shapes;

public class Triangle extends Shape{
    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(char color, int height) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String s = "";

        int x = getX();
        for (int j = 1; j < height + 1; j++) {
            for (int i = 0; i < x; i++)
                s += " ";
            for (int i = 0; i < height - j; i++)
                s += " ";
            for (int i = 0; i < 2 * j - 1; i++)
                s += super.color;
            s += "\n";
        }
        return s;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
