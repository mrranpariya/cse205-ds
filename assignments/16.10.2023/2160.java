import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int newHeights[] = new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            newHeights[i]=heights[i];
        }
        Arrays.sort(heights);
        int ans=0;

        for(int i=0; i<heights.length; i++) {
            if(heights[i]!=newHeights[i]) {
                ans++;
            }
        }

        return ans;
    }
}