public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {

        //The cheapest strategy to find the longest repeating character with replacement will be
        //WindowSize-maxFreq <= k

        int n = s.length();
        int[] arr = new int[26];
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int maxLen = 0;

        while (r < n) {
            arr[s.charAt(r)-'A']++;    // Added the character to freq array
            maxFreq = Math.max(maxFreq, arr[s.charAt(r)-'A']);     //Updated the maxFreq
            //Checking window vailidity
            while (r-l+1 - maxFreq > k) {
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(r-l+1, maxLen);
            r++;
        }

        return maxLen;
    }
}
