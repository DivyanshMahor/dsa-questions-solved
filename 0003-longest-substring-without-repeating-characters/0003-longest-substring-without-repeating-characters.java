class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right;
        int longest = 0;

        Map<Character, Integer> map = new HashMap<>();

      for(right = 0; right < s.length(); right++){

        char ch = s.charAt(right);
        map.put(ch,map.getOrDefault(ch,0)+1);

        while(right-left+1 > map.size()){

            char lch = s.charAt(left);
            map.put(lch,map.getOrDefault(lch,0)-1);
   

        if(map.get(lch) == 0 ){
            map.remove(lch);
        }
        
        left++;

        }

    longest = Math.max(longest, right-left+1 );

      }

      return longest;
    }
}