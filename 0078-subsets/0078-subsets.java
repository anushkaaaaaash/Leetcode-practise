
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int index, int[] nums, List<Integer> temp) {

        if(index == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Include the element
        temp.add(nums[index]);
        solve(index + 1, nums, temp);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Don't include the element
        solve(index + 1, nums, temp);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, temp);
        return ans;
    }
}
