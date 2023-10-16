import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int[] dif = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            dif[i] = arr[i+1] - arr[i];
        }
        Arrays.sort(dif);
        int min = dif[0];
        for(int i=0; i<arr.length-1; i++){
            int d = arr[i+1] - arr[i];
            if(d == min){
                ArrayList<Integer> x = new ArrayList<>();
                x.add(arr[i]);
                x.add(arr[i+1]);
                list.add(x);
            }
        }
        return list;
    }
}