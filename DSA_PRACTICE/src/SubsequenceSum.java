import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {

    public static List<List<Integer>> findSubsequences(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findSubsequences(nums, k, 0, current, result);
        return result;
    }

    private static void findSubsequences(int[] nums, int k, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            int sum = 0;
            for (int num : current) {
                sum += num;
            }
            if (sum == k) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // Exclude current element
        findSubsequences(nums, k, index + 1, current, result);

        // Include current element
        current.add(nums[index]);
        findSubsequences(nums, k, index + 1, current, result);

        // Remove current element for backtracking
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 7;

        List<List<Integer>> subsequences = findSubsequences(nums, k);
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
}
