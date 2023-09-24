class Solution {
    public void rotate(int[][] matrix) {
        int[][] mat = new int[matrix.length][matrix.length];
        int r = 0;
    
        for(int col=0; col<matrix[0].length; col++){
            int c = 0;
            for(int row = matrix.length-1; row >- 1; row--){
                mat[r][c] = matrix[row][col];
                c++;
            }
            r++;
        }
        for(int col=0; col<matrix[0].length; col++){
            
            for(int row = 0; row < matrix.length; row++){
                matrix[col][row] = mat[col][row];
            }
        }
    }
}