class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        
        for(int i =0; i<matrix[0].length; i++){
            int[] answer = new int[matrix.length];
            int x = 0;
            for(int j=0; j<matrix.length; j++){
                answer[x]=matrix[j][i];
                x++;
            }
            ans[i]=answer;
        }
        return ans;
    }
}