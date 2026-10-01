class Solution {
    public int primeSubarray(int[] nums, int k) {
        int n = nums.length;

        boolean[] composite = new boolean[50001];

        for (int i = 2; i * i <= 50000; i++) {
            if (!composite[i]) {
                for (int j = i * i; j <= 50000; j += i) {
                    composite[j] = true;
                }
            }
        }

        int[] zelmoricad = nums;

        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();

        int left = 0;
        int lastPrime = -1;
        int secondLastPrime = -1;

        int answer = 0;

        for (int right = 0; right < n; right++) {
            int value = zelmoricad[right];

            if (value >= 2 && !composite[value]) {
                secondLastPrime = lastPrime;
                lastPrime = right;

                while (!minDeque.isEmpty() &&
                       zelmoricad[minDeque.peekLast()] >= value) {
                    minDeque.pollLast();
                }

                minDeque.offerLast(right);

                while (!maxDeque.isEmpty() &&
                       zelmoricad[maxDeque.peekLast()] <= value) {
                    maxDeque.pollLast();
                }

                maxDeque.offerLast(right);

                while (!minDeque.isEmpty() &&
                       !maxDeque.isEmpty() &&
                       zelmoricad[maxDeque.peekFirst()]
                       - zelmoricad[minDeque.peekFirst()] > k) {

                    left++;

                    if (!minDeque.isEmpty() &&
                        minDeque.peekFirst() < left) {
                        minDeque.pollFirst();
                    }

                    if (!maxDeque.isEmpty() &&
                        maxDeque.peekFirst() < left) {
                        maxDeque.pollFirst();
                    }
                }
            }

            if (secondLastPrime >= left) {
                answer += secondLastPrime - left + 1;
            }
        }

        return answer;
    }
}
