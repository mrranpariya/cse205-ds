import java.util.*;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] arr=new int [k];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> arrl =new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int tot=0;
        int z=0;

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            arrl.add(nums[i]);
        }

        for(int i=0;i<k;i++){
            int b=pq.remove();
             if(map.containsKey(b)){
                int a=map.get(b);
                map.remove(b);
                map.put(b,a+1);
            }
            else{
                map.put(b,1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(z==k){
                break;
            }
            if(map.containsKey(arrl.get(i))){
                arr[z]=arrl.get(i);
                if(map.get(arrl.get(i))>1){
                    int a=map.get(arrl.get(i));
                    map.remove(arrl.get(i));
                    map.put(arrl.get(i),a-1);
                }
                else{
                    map.remove(arrl.get(i));
                }
                z++;
            }
        }

       
        return arr;
    }
}