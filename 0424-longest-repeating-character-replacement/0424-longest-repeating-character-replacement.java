class Solution {
    public int characterReplacement(String s, int k) {
        int right;
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] freq = new int[26];

        for(right = 0; right < s.length(); right++){

           int index = s.charAt(right) - 'A';
           freq[index]++;
        
           maxFreq = Math.max(maxFreq,  freq[index] );

           if((right - left +1) - maxFreq > k ){

            index = s.charAt(left) - 'A';
            freq[index]--;

            left++;
           }

           maxLen = Math.max(maxLen, right - left +1);


        }
return maxLen;

    }
}