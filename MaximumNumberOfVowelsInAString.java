package SlidingWindowProbs;
import java.util.*;


public class MaximumNumberOfVowelsInAString {
    public int maxVowels(String s, int k) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        char[] chArr = {'a','e','i','o','u'};
        for(char c : chArr){
            set.add(c);
        }

        int cnt = 0;
        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                cnt++;
            }
        }

        int maxCnt = cnt;

        int l = 0;
        int r = k-1;

        while (r < n) {
            char ch1 = s.charAt(l);
            if (set.contains(ch1)) {
                cnt--;
            }
            l++;

            char ch2 = s.charAt(r);
            if (set.contains(ch2)) {
                cnt++;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt;
    }
}
