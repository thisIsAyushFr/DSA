class Solution {
    public int smallestAbsent(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int sum = 0;
        for (int x : nums) {
            seen.add(x);
            sum += x;
        }
        int ans = Math.max(1, sum / nums.length + 1);
        while (seen.contains(ans)) {
            ans++;
        }
        return ans;
    }}