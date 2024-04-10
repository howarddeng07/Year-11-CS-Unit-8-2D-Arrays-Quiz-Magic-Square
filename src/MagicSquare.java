public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int i = 0; i < array2d[0].length; i++) {
            sum += array2d[0][i];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        for (int i = 1; i < array2d.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array2d[i].length; j++) {
                rowSum += array2d[i][j];
            }
            if (rowSum != checkSum) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        for (int i = 0; i < array2d[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < array2d.length; j++) {
                colSum += array2d[j][i];
            }
            if (colSum != checkSum) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int i = 0; i < array2d.length; i++) {
            diagSum1 += array2d[i][i];
            diagSum2 += array2d[i][array2d.length - 1 - i];
        }
        return diagSum1 == checkSum && diagSum2 == checkSum;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int checkSum = calculateCheckSum(array2d);
        return magicRows(array2d, checkSum) &&
                magicColumns(array2d, checkSum) &&
                magicDiagonals(array2d, checkSum);
    }


}
