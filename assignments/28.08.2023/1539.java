import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] answer = new int[1001];
        int j = 0;
        for(int i = 1; ; i++){
            if(Arrays.binarySearch(arr, i) < 0 ){
                answer[j] = i;
                j++;
            }
            if(j == answer.length){
                break;
            }
        }
        return answer[k-1];
    }

}
