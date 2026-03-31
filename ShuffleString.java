public class ShuffleString {
    
    public String restoreString(String s, int[] indices) {

        char[] ch = new char[s.length()];  // Making a character array

        for(int i = 0 ; i < indices.length ; i++){ // Shuffling each element of the string in the character array.

            ch[indices[i]] = s.charAt(i);

        }

        String str = new String(ch);     // Making a new string 

        return str;


    }


    public static void main(String[] args) {
        
        ShuffleString ss = new ShuffleString();

        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";

        String reStr = ss.restoreString(s, indices);

        System.out.println(reStr);

        
    }
}
