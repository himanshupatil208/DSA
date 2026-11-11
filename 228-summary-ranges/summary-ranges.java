
class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {

            int start = i;

            while (i + 1 < nums.length &&
                   (long) nums[i + 1] == (long) nums[i] + 1) {
                i++;
            }

            if (start == i) {
                result.add("" + nums[start]);
            }
            else {
                result.add(nums[start] + "->" + nums[i]);
            }

            i++;
        }

        return result;
    }
}
