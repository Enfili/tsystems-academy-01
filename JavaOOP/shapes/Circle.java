package shapes;

public class Circle extends Shape{
    private int diameter;

    public Circle(int radix) {
        this.diameter = radix;
    }

    public Circle(char color, int diameter) {
        super(color);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        String s = "";

        int x = getX();

        double h = diameter / 2.0;
        for (int j = diameter / 2; j > 0; j--) {
            double o = j;
            int c = 2 * (int) Math.floor(h * Math.cos(Math.asin(o / h))) - 1;

            if (c > 0) {
                int emptySpaces = diameter % 2 == 0 ? diameter / 2 - c / 2 - 1 : diameter / 2 - c / 2;
                int colors = diameter % 2 == 0 ? c + 1 : c;
                s += drawRow(emptySpaces, colors, x);
            }
        }

        int nbOfCentralRows = diameter % 2 == 0 ? 2 : 1;
        for (int i = 0; i < nbOfCentralRows; i++) {
            for (int j = 0; j < x; j++)
                s += " ";
            for (int j = 0; j < diameter; j++)
                s += this.color;
            s += '\n';
        }


        for (int j = 1; j <= diameter / 2; j++) {
            double o = j;
            int c = 2 * (int) Math.floor(h * Math.cos(Math.asin(o / h))) - 1;

            if (c > 0) {
                int emptySpaces = diameter % 2 == 0 ? diameter / 2 - c / 2 - 1 : diameter / 2 - c / 2;
                int colors = diameter % 2 == 0 ? c + 1 : c;
                s += drawRow(emptySpaces, colors, x);
            }
        }

        return s;
    }

    private String drawRow(int emptySpaces, int colors, int x) {
        String s = "";
        for (int i = 0; i < x; i++) {
            s += " ";
        }
        for (int i = 0; i < emptySpaces; i++) {
            s += " ";
        }
        for (int i = 0; i < colors; i++) {
            s += this.color;
        }
        s += '\n';
        return s;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
