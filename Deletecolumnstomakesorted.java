class deletecolumntomakesorted {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int deleteCount = 0;

        // Traverse each column
        for (int col = 0; col < cols; col++) {
            // Check if this column is sorted
            for (int row = 1; row < rows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    deleteCount++;
                    break; // move to next column
                }
            }
        }       
        return deleteCount;
    }
}
