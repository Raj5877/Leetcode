class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        prefix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0&&j==0)
                    prefix[0][0] = nums[0][0];
                else if(i==0){
                    prefix[0][j] = prefix[0][j-1] + nums[0][j];
                }
                else if(j==0){
                    prefix[i][0] = prefix[i-1][0] + nums[i][0];
                }
                else{
                    prefix[i][j] = prefix[i][j-1] + prefix[i-1][j] - prefix[i-1][j-1] + nums[i][j];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1==0 && col1==0)
            return prefix[row2][col2];
        else if(col1==0)
            return prefix[row2][col2] - prefix[row1-1][col2];
        else if(row1==0)
            return prefix[row2][col2] - prefix[row2][col1-1];
        else
            return prefix[row2][col2] - prefix[row1-1][col2] - prefix[row2][col1-1] + prefix[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */