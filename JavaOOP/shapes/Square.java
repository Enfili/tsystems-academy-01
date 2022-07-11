package shapes;

public class Square extends Shape{
    private int size;

    public Square(int size) {
        this.size = size;
    }

    public Square(char color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String s = "";

        int x = getX();

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < x; i++)
                s += " ";
            for (int i = 0; i < size; i++)
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
