class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        int[] head = new int[n], next = new int[n];
        java.util.Arrays.fill(head, -1);
        for (int i = 1; i < n; i++) {
            next[i] = head[parent[i]];
            head[parent[i]] = i;
        }

        int[] order = new int[n];
        int[][] anc = new int[n][];
        int[] np = parent.clone();
        int qh = 0, qt = 0;
        order[qt++] = 0;
        anc[0] = new int[26];
        java.util.Arrays.fill(anc[0], -1);
        anc[0][s.charAt(0) - 'a'] = 0;

        while (qh < qt) {
            int u = order[qh++];
            for (int v = head[u]; v != -1; v = next[v]) {
                int c = s.charAt(v) - 'a';
                if (anc[u][c] != -1) np[v] = anc[u][c];
                anc[v] = anc[u].clone();
                anc[v][c] = v;
                order[qt++] = v;
            }
        }

        int[] size = new int[n];
        java.util.Arrays.fill(size, 1);
        for (int i = n - 1; i > 0; i--) {
            int x = order[i];
            size[np[x]] += size[x];
        }
        return size;
    }
}