import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ss(0, new ArrayList<>(), nums, result);
        return result;
    }
    private void ss(int start, List<Integer> path, int[] nums,List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            ss(i + 1, path, nums, result);
            path.remove(path.size() - 1);
        }
    }
}