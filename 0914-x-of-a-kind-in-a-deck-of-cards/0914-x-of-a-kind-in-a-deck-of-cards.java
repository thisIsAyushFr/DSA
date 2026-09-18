class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : deck) {
            freq.merge(x, 1, Integer::sum);
        }
        int g = 0;
        for (int count : freq.values()) {
            g = gcd(g, count);
        }
        return g >= 2;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }}