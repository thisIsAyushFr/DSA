class Solution {
        public boolean maxSubstringLength(String s, int k) {
        if (k == 0) {
            return true;
        }

        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, n);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';

            first[c] = Math.min(first[c], i);
            last[c] = i;
        }

        List<int[]> intervals = new ArrayList<>();

        for (int c = 0; c < 26; c++) {
            if (last[c] == -1) {
                continue;
            }

            int left = first[c];
            int right = last[c];
            boolean valid = true;

            for (int i = left; i <= right; i++) {
                int current = s.charAt(i) - 'a';

                if (first[current] < left) {
                    valid = false;
                    break;
                }

                right = Math.max(right, last[current]);
            }

            if (valid && !(left == 0 && right == n - 1)) {
                intervals.add(new int[]{left, right});
            }
        }

        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int previousEnd = -1;

        for (int[] interval : intervals) {
            if (interval[0] > previousEnd) {
                count++;
                previousEnd = interval[1];

                if (count >= k) {
                    return true;
                }
            }
        }

        return false;
    }
}
