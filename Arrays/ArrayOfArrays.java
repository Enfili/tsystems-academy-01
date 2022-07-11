public class ArrayOfArrays {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix = new int[][]{{2, 3}, {2, 7}};
        int[][] bMatrix = new int[][]{{1, 1}, {1, 8}};

        printMatrix(matrixAddition(aMatrix, bMatrix));
        //printMatrix(matrixMultiplication(aMatrix, bMatrix));
        System.out.println();
        printMatrix(aMatrix);
        System.out.println();
        //printMatrix(matrixTransposition(aMatrix));
        //System.out.println();
        printMatrix(bMatrix);
        System.out.println();
        //printMatrix(matrixTransposition(bMatrix));


//        //populate matrix
//        for (int i = 0; i < aMatrix.length; i++) {
//            //aMatrix[i] = new int[5];	//create sub-array
//            for (int j = 0; j < aMatrix[i].length; j++) {
//                aMatrix[i][j] = i + j;
//            }
//        }
//
//        //print matrix
//        for (int i = 0; i < aMatrix.length; i++) {
//            for (int j = 0; j < aMatrix[i].length; j++) {
//                System.out.print(aMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static boolean isNullMatrix(int[][] m) {
        if (m == null)
            return true;
        for (int j = 0; j < m.length; j++) {
            if (m[j] == null)
                return true;
        }
        return false;
    }

    private static int[][] matrixAddition(int[][] a, int[][] b) {
        if (isNullMatrix(a) || isNullMatrix(b))
            return null;
        if (!areSameDimensions(a, b))
            return null;

        int[][] m = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = a[i][j] + b[i][j];
            }
        }
        return m;
    }

    private static boolean areSameDimensions(int[][] a, int[][] b) {
        if (a.length != b.length)
            return false;
        for (int j = 0; j < a.length; j++) {
            if (a[j].length != b[j].length)
                return false;
        }
        return true;
    }

    private static int[][] matrixMultiplication(int[][] a, int[][] b) {
        if (isNullMatrix(a) || isNullMatrix(b))
            return null;
        if (!areCorrectDimensionsForMultiplication(a, b))
            return null;

        int[][] m = new int[b[0].length][a.length];
        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m[j].length; i++) {
                for (int k = 0; k < b.length; k++) {
                    m[j][i] += a[j][k] * b[k][i];
                }
            }
        }

        return m;
    }

    private static boolean areCorrectDimensionsForMultiplication(int[][] a, int[][] b) {
        for (int[] ints : b) {
            if (a.length != ints.length)
                return false;
        }
        for (int[] ints : a) {
            if (b.length != ints.length)
                return false;
        }
        return true;
    }

    private static int[][] matrixTransposition(int[][] a) {
        if (isNullMatrix(a))
            return null;
        for (int[] ints : a) {
            if (a[0].length != ints.length)
                return null;
        }

        int[][] m = new int[a[0].length][a.length];

        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                m[j][i] = a[i][j];
            }
        }
        
        return m;
    }

    private static void printMatrix(int[][] m) {
        if (isNullMatrix(m)) {
            System.out.println("null");
            return;
        }

        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m[j].length; i++) {
                System.out.print(m[j][i] + "  ");
            }
            System.out.println();
        }
    }
}
