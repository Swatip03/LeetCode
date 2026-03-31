public class LongestCommonPrefix {
    
    public String longestCommonPrefix(String[] strs) {

        char[] ch = new char[strs[0].length()];

        for(int i = 0 ; i < ch.length ; i++){

            ch[i] = strs[0].charAt(i);

        }

        // Now comparing all the character of the first array with the characters of the strs array

        StringBuilder sb = new StringBuilder();

        
        for(int i = 0 ; i < ch.length ; i++){

            for(int j = 1 ; j < strs.length ; j++){

                for(int k = 0 ; k < strs[j].length() ; k++){

                    if (ch[i] == strs[j].charAt(k)) {

                        sb.append(ch[i]);
                        
                    }
                }
            }


        }

        String str = sb.toString();

        return str;
        
    }

    public static void main(String[] args) {
        
        LongestCommonPrefix lc = new LongestCommonPrefix();

        String[] strs = {"flower","flow","flight"};

        String str = lc.longestCommonPrefix(strs);

        System.out.println(str);

    }

}
