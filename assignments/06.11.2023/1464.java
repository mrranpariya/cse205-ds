class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> a = new PriorityQueue<>(Comparator.reverseOrder());
        for(int x: nums){
            a.add(x-1);
        }
        return a.poll()*a.poll();
    }
}