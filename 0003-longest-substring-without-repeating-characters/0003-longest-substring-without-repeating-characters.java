class Solution {
    public int lengthOfLongestSubstring(String s) {

        int winStart = 0;
        int longest = 0;
        int winEnd;

        Map<Character, Integer> map = new HashMap<>();

        for(winEnd = 0; winEnd < s.length(); winEnd++){

            char incomingCh = s.charAt(winEnd);

            map.put(incomingCh, map.getOrDefault(incomingCh, 0)+1);

            while( map.size() < winEnd - winStart + 1 ){

                char outcomingCh = s.charAt(winStart);
                map.put(outcomingCh, map.getOrDefault(outcomingCh,0)-1);

                if( map.get(outcomingCh) == 0 ){
                    map.remove(outcomingCh);
                }
                winStart++;
            } 

            longest = Math.max(longest, winEnd - winStart + 1);
        }
        return longest; 
    }
}