class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            int x = nums1[i];
            for(int j=0; j<nums2.length; j++){
                if(nums2[j]==x){
                    int z = find(nums2, j, nums2[j]);
                    arr[i] = z; 
                }
            }
        }

        return arr;
    }
    public static int find(int[] arr, int x, int y){
        if(x>arr.length-1){
            return -1;
        }
        if(arr[x]>y){
            return arr[x];
        }
        else{
            return find(arr, x+1, y);
        }
    }
}