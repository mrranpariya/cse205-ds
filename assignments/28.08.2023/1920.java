class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        return helper(nums, ans, 0);

    }
    public int[] helper(int[] nums, int[] ans, int index){
        if(index == nums.length){
            return ans;
        }
        ans[index] = nums[nums[index]];
        return helper(nums, ans, index+1);
    }
}
