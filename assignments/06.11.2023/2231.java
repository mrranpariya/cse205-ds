class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();

        while(num != 0){
            int x = num%10;
            list.add(x);
            if(x % 2 ==0){
                even.add(x);
            }
            else{
                odd.add(x);
            }
            num = num/10;
        }

        System.out.println(list);
        
        int ans = 0;
        for(int i=list.size()-1; i>=0; i--){
            int y = 0;
            if(list.get(i)%2==0){
                y = even.poll();
            }
            else{
                y = odd.poll();
            }
            ans = ans*10 + y;
        }

        return ans;
    }
}