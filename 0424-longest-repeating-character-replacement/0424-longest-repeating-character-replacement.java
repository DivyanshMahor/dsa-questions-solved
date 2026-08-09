class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // Highest frequency in the window
            maxFreq = Math.max(maxFreq, freq[index]);

            // Characters that need to be replaced
            int changes = (right - left + 1) - maxFreq;

            // If replacements exceed k, shrink window
            while (changes > k) {

                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;

                left++;

                changes = (right - left + 1) - maxFreq;
            }

            // Valid window
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}