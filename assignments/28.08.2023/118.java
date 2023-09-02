import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        helper(numRows, answer);
        return answer;
    }
    public static List<List<Integer>> helper(int n, List<List<Integer>> answer) {
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1){
                    list.add(1);
                } else if (i > 2) {
                    List<Integer> list2 = answer.get(i-2);
                    int x = list2.get(j - 1);
                    int y = list2.get(j);

                    int sum = x + y;
                    list.add(sum);
                }
            }
            answer.add(list);
        }
        return answer;
    }
}