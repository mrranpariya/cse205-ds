class Solution {
    public int triangularSum(int[] nums) {
        int[] result = FindSum(nums);
        return result[0];
    }
    
    private int[] FindSum(int[] nums){
        if(nums.length == 1)
            return nums;
        
        int[] numss = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++)
            numss[i] = (nums[i]+nums[i+1])%10;
        
        return FindSum(numss);
    }
}