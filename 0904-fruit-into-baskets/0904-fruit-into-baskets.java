class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int right;
        for (right = 0; right < fruits.length; right++) {

            int fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);

            while (basket.size() > 2) {

                int outFruit = fruits[left];
                basket.put(outFruit, basket.getOrDefault(outFruit, 0) - 1);

                if (basket.get(outFruit) == 0) {

                    basket.remove(outFruit);
                }

                left++;
            }
            
                maxLen = Math.max(maxLen, right - left + 1);
            

        }

        return maxLen;
    }
}