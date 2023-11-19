class Solution {
    public int[] findmax(int[] arr){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            int[] ans = findmax(score);
            // System.out.println(ans[0]);
            if(i == 0){
                arr[ans[1]] = "Gold Medal";
                score[ans[1]] = -1;
            }
            if(i == 1){
                arr[ans[1]] = "Silver Medal";
                score[ans[1]] = -1;
            }
            if(i == 2){
                arr[ans[1]] = "Bronze Medal";
                score[ans[1]] = -1;
            }
            if(i>2){
                arr[ans[1]] = ""+(i+1);
                score[ans[1]] = -1;
            }
        }

        
        return arr;
    }
}