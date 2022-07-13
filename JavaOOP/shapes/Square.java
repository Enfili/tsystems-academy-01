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
        StringBuilder sb = new StringBuilder();

        int x = getX();

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < x; i++)
                sb.append(" ");
            for (int i = 0; i < size; i++)
                sb.append(super.color).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
