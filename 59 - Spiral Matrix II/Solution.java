class Solution {
    public int[][] generateMatrix(int n) {
        var matrix = new int[n][n];

        for (int firstRow = 0, firstCol = 0, lastRow = n - 1, lastCol = n - 1, val = 1; firstRow <= lastRow
                && firstCol <= lastCol; firstCol++) {
            // first row
            for (var i = firstCol; i <= lastCol; matrix[firstRow][i++] = val++)
                ;
            // last col
            for (var i = ++firstRow; i <= lastRow; matrix[i++][lastCol] = val++)
                ;

            if (firstRow > lastRow || firstCol > --lastCol)
                break;

            // last row
            for (var i = lastCol; i >= firstCol; matrix[lastRow][i--] = val++)
                ;
            // first col
            for (var i = --lastRow; i >= firstRow; matrix[i--][firstCol] = val++)
                ;
        }
        // System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    // public static void main(String[] args) {
    // Solution s = new Solution();
    // System.out.println(s.generateMatrix(3));
    // }
}