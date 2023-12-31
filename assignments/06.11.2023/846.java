class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       Arrays.sort(hand);
       int len = hand.length;
       boolean[] visited = new boolean[len];
       for(int i = 0;i < len;i++){
           if(visited[i]) continue;
           visited[i] = true;
           int j = i + 1;
           int count = 1;
           int num = hand[i] + 1;
           for(count = 1;j < len && count < groupSize;j++){
               if(visited[j]) continue;
               if(hand[j] > num) break;
               if(hand[j] == num ) {
                   num++;
                   visited[j] = true;
                   count++;
               }
           }
           if(count < groupSize) return false;
       }
       return true;
    }
}