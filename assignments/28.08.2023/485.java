class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] count1 = new int[nums.length];
        int count = 0;
        int max = 0;
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            count1[j] = count;
            if(count1[j]>max){
                max = count1[j];
            }
            j++;
            if(nums[i]==0){
                count = 0;
            }
        }
        
        return max;
    }
}
