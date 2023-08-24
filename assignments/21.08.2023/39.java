import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        sum(answer, new ArrayList<>(), arr, target, arr.length - 1);
        return answer;
    }
    public void sum(List<List<Integer>> answer, List<Integer> list, int[] arr, int target, int index) {
        if (index == -1) {
            if (target == 0)
                answer.add(new ArrayList<>(list));
            return;
        }
        if (target < 0)
            return;
        if (target == 0) {
            answer.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        sum(answer, list, arr, target - arr[index], index);
        list.remove(list.size() - 1);
        sum(answer, list, arr, target, index - 1);
    }
}
