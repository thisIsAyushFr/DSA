
import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> seen = new HashSet<>();

        pq.offer(1L);
        seen.add(1L);

        long ugly = 1;

        for (int i = 0; i < n; i++) {
            ugly = pq.poll();

            long a = ugly * 2;
            long b = ugly * 3;
            long c = ugly * 5;

            if (seen.add(a)) {
                pq.offer(a);
            }

            if (seen.add(b)) {
                pq.offer(b);
            }

            if (seen.add(c)) {
                pq.offer(c);
            }
        }

        return (int) ugly;
    }
}
