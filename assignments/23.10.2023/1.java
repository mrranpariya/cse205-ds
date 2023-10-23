import java.util.*;
class Solution {
public int[] twoSum(int[] A, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] res = new int[2];
    for(int i = 0, a;; i++){
        if(map.containsKey(A[i])){
            res[0] = map.get(A[i]);
            res[1] = i;
            return res;
        }
        map.put(k - A[i], i);
    }
}
}