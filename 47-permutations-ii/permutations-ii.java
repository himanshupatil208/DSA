class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result, boolean[] used    ) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        if (used[i]) {
                continue;
            }
        if (i>0 && nums[i]==nums[i-1] && !used[i-1]) {
            continue;
        }

        used[i]=true;

        current.add(num);
        backtrack(nums, current, result, used);
        current.remove(current.size() - 1);
        used[i]=false;
    }
    }
}