class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();

        int windowEnd;
        int windowStart = 0;
        int maxCollectedFruits = 0;

        for(windowEnd = 0; windowEnd < fruits.length; windowEnd++){

            int incomingFruits = fruits[windowEnd];

            basket.put(incomingFruits, basket.getOrDefault(incomingFruits, 0 )+1);

            while( basket.size() > 2 ){

                int outcomingFruits = fruits[windowStart];

                basket.put(outcomingFruits, basket.getOrDefault(outcomingFruits, 0)-1);

                if(basket.get(outcomingFruits) == 0){
                    basket.remove(outcomingFruits);
                }
                windowStart++;
            } 

        
                maxCollectedFruits = Math.max(maxCollectedFruits, windowEnd - windowStart + 1 );
            

        }
        return maxCollectedFruits;
    }
}