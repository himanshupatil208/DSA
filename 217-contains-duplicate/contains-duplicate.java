class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len1 = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(hashMap);

        for (int n : hashMap.values()) {
            if (n > 1) {
                return true;
            }
        }

        return false;
    }
}