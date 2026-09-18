class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder out = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '-') continue;
            if (count == k) {
                out.append('-');
                count = 0;
            }
            out.append(Character.toUpperCase(c));
            count++;
        }
        return out.reverse().toString();
    }
}