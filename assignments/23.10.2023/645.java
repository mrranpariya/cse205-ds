import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])==false){
                count = 1;
                map.put(nums[i], count);
            }
            else{
                ans[0] = nums[i];
            }
        }
        
        int[] arr = new int[nums.length];
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(i+1)==false){
                ans[1] = i+1;
            }
        }
        
        return ans;
    }
}