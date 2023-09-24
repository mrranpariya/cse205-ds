class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        for(int i = 0; i<accounts.length; i++){
            int count = 0;
            for(int j = 0; j<accounts[i].length; j++){
                count = count + accounts[i][j];
            }
            arr[i] = count;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}