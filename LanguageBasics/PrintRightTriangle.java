public class PrintRightTriangle {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;

        while(i < size) {
            printChars(2 * (i + 1) - 1, '*');
            System.out.println();
            i++;
        }
    }

    private static final void printChars(int length, char c) {
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}
