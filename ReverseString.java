import java.util.Arrays;

public class ReverseString {
    
    public void reverseString(char[] s) {

        String str = "";

        for(int i = 0 ;i < s.length ; i++){

            str = str + s[s.length - 1 -i];

        }

        

        for(int i = 0 ; i < s.length ; i++){

            s[i] = str.charAt(i);

        }
        
    }


    public static void main(String[] args) {
        
        ReverseString rr = new ReverseString();

        char[] s = {'H','e','l','l','o'};

        rr.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
