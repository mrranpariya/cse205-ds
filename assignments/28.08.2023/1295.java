class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int count1 = 0;
            int a1 = nums[i];
            while(a1 != 0){
                a1 = a1/10;
                count1++;
            }
            if(count1%2 == 0){
                count++;
            }
        }
        return count;
        
    }
}
