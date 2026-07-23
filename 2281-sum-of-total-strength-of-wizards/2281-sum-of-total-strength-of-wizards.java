import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    private static final long MOD = 1_000_000_007L;

    public int totalStrength(int[] strength) {

        int n = strength.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        // Previous strictly smaller element
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty()
                    && strength[stack.peek()] >= strength[i]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next smaller or equal element
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty()
                    && strength[stack.peek()] > strength[i]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        /*
         * prefix[i + 1] = strength[0] + ... + strength[i]
         */
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] =
                    (prefix[i] + strength[i]) % MOD;
        }

        /*
         * prefixOfPrefix[i + 1]
         * = prefix[0] + prefix[1] + ... + prefix[i]
         */
        long[] prefixOfPrefix = new long[n + 2];

        for (int i = 0; i <= n; i++) {
            prefixOfPrefix[i + 1] =
                    (prefixOfPrefix[i] + prefix[i]) % MOD;
        }

        long answer = 0;

        for (int i = 0; i < n; i++) {

            int l = left[i];
            int r = right[i];

            long leftChoices = i - l;
            long rightChoices = r - i;

            /*
             * prefix[i + 1] + prefix[i + 2] + ... + prefix[r]
             */
            long rightPrefixSum =
                    (prefixOfPrefix[r + 1]
                            - prefixOfPrefix[i + 1]
                            + MOD) % MOD;

            /*
             * prefix[l + 1] + prefix[l + 2] + ... + prefix[i]
             */
            long leftPrefixSum =
                    (prefixOfPrefix[i + 1]
                            - prefixOfPrefix[l + 1]
                            + MOD) % MOD;

            /*
             * Sum of all subarray sums
             * where strength[i] is minimum
             */
            long totalSubarraySum =
                    (rightPrefixSum * leftChoices) % MOD;

            totalSubarraySum =
                    (totalSubarraySum
                            - (leftPrefixSum * rightChoices) % MOD
                            + MOD) % MOD;

            long contribution =
                    (strength[i] % MOD) * totalSubarraySum % MOD;

            answer = (answer + contribution) % MOD;
        }

        return (int) answer;
    }
}