
class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            count += map.getOrDefault(prefix[i] - k, 0);
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }

        return count;
    }
}