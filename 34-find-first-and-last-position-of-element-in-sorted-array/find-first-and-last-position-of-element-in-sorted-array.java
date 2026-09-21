class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target);
        int last = lastOcc(nums, target);

        return new int[]{first, last};
    }

    int firstOcc(int[] nums, int target) {
        int result = -1;

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                result = mid;
                j = mid - 1;
            }
            else if (nums[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        return result;
    }

    int lastOcc(int[] nums, int target) {
        int result = -1;

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                result = mid;
                i = mid + 1;
            }
            else if (nums[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        return result;
    }
}