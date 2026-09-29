class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        int l = 0;
        int r = 0;

        while (r < n) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r]) {
                deque.pollLast();
            }

            deque.addLast(r);

            if (deque.peekFirst() < l) {
                deque.pollFirst();
            }

            if (r >= k - 1) {
                result[l] = nums[deque.peekFirst()];
                l++;
            }

            r++;
        }

        return result;

    }
}