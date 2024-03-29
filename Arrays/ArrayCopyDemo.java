public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        System.out.println(new String(copyTo));

        int[] copyFromInt = new int[1_000_000];
        int[] copyToInt = new int[1_000_000];
//        System.out.println(arraycopy(copyFromInt, 0, copyToInt, 5, 7));
//        System.out.println(arraycopy(copyFromInt, 10, copyToInt, 0, 7));
//        System.out.println(arraycopy(copyFromInt, 0, copyToInt, 0, 7));

        long startTime = System.currentTimeMillis();
        arraycopy(copyFromInt, 0, copyToInt, 0, 1_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println("My arraycopy: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.arraycopy(copyFromInt, 0, copyToInt, 0, 1_000_000);
        endTime = System.currentTimeMillis();
        System.out.println("System arraycopy: " + (endTime - startTime));
    }

    private static boolean arraycopy(int[] source, int srcIndex, int[] dest, int destIndex, int length) {
        if (srcIndex + length > source.length || destIndex + length > dest.length)
            return false;

        for (int j = 0; j < length; j++)
            dest[destIndex + j] = source[srcIndex + j];

        return true;
    }
}
