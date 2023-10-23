class Solution {
    public int numIdenticalPairs(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return 0;
        }
        return helper(nums,0,1,0);
    }
    public int helper(int nums[],int x, int y, int count){
        if(y == nums.length){
            x++;
            y = x+1;
        }
        if(x == nums.length-1){
            return count;
        }
        else{
            if(nums[x] == nums[y]){
                count++;
            }
        }
        return helper(nums, x, y+1, count);
    }
}