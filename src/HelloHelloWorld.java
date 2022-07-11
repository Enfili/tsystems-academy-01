class HelloHelloWorld {
    public static void main(String[] jahoda) {
//        int j = 0;
//        do {
//            System.out.println("Hello World! Hello World!");
//            j++;
//        } while (j < 2);

        int x = 4;
        int y = 5;
        swap(x, y);
        System.out.println(x + " " + y);
    }

    private static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }
}