class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> a = new PriorityQueue<>(Comparator.reverseOrder());
        for(int f:stones){
            a.add(f);
        }
        int ans = 0;
        while(a.size()!=0){
            if(a.size()==0){
                ans = 0;
            }
            if(a.size()==1){
                ans = a.poll();
            }
            else{
                int y = a.poll() - a.poll();
            
                if(y != 0){
                    a.add(y);
                }
            }
        }
        return ans;
    }
}