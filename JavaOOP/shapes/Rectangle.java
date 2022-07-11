package shapes;

public class Rectangle extends Shape{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(char color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < x; i++)
                s += " ";
            for (int i = 0; i < height; i++)
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
