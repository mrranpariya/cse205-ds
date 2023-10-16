import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        
        int k = 0;
        for(int i=0; i<arr2.length; i++){
            int x = arr2[i];
            for(int j=0; j<arr1.length; j++){
                if(k<arr1.length && arr1[j]==x){
                    arr1[j] = -1;
                    arr3[k] = arr2[i];
                    k++;
                }
            }
        }
        Arrays.sort(arr1);
        for(int a:arr1){
            if(k<arr1.length && a != -1){
                arr3[k] = a;
                k++;
            }
        }
        return arr3;
    }
}