class Solution {
    public int findRepeatNumber(int[] nums) {
        // hashset O(n)
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
