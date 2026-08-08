import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> frequency = new HashMap<>();

        int left = 0;
        int longest = 0;

        for (int right = 0; right < fruits.length; right++) {
            frequency.merge(fruits[right], 1, Integer::sum);

            while (frequency.size() > 2) {
                int fruit = fruits[left];

                frequency.merge(fruit, -1, Integer::sum);

                if (frequency.get(fruit) == 0) {
                    frequency.remove(fruit);
                }

                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}