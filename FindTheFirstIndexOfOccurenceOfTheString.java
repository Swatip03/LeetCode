public class FindTheFirstIndexOfOccurenceOfTheString {
    
    public int strStr(String haystack, String needle) {

        int idx = haystack.indexOf(needle);

        return idx;
        
    }

    public static void main(String[] args) {
        
        FindTheFirstIndexOfOccurenceOfTheString ff = new FindTheFirstIndexOfOccurenceOfTheString();

        String haystack = "leetcode";
        String needle = "leeto";

        int ans = ff.strStr(haystack, needle);

        System.out.println(ans);
    }
}
