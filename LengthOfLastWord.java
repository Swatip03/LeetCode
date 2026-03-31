public class LengthOfLastWord {
    
    public int lengthOfLastWord(String s) {

        String st = s.trim();

        String[] str = st.split(" ");

        int lenOfLastWord = str[str.length-1].length();



        return lenOfLastWord;
        
    }


    public static void main(String[] args) {
        
        LengthOfLastWord ll = new LengthOfLastWord();

        String s = "luffy is still joyboy";

        int ans = ll.lengthOfLastWord(s);

        System.out.println(ans);
    }
}
