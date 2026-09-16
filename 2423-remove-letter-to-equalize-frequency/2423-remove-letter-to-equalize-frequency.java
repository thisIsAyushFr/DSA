class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int remove = 0; remove < 26; remove++) {
            if (freq[remove] == 0) continue;
            freq[remove]--;
            int target = 0;
            boolean valid = true;
            for (int f : freq) {
                if (f == 0) continue;
                if (target == 0) {
                    target = f;
                } else if (f != target) {
                    valid = false;
                    break;
                }
            }
            freq[remove]++;
            if (valid) return true;
        }
        return false;
    }
}