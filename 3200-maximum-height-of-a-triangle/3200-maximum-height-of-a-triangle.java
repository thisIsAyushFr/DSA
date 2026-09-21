class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(height(red, blue), height(blue, red));
    }
    private int height(int first, int second) {
        int row = 1;
        while (true) {
            if (row > first) return row - 1;
            first -= row;
            row++;
            if (row > second) return row - 1;
            second -= row;
            row++;}}}