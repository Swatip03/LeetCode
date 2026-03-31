public class RemoveAllOccuranceOfASubstring {
    
    public String removeOccurrences(String s, String part) {

        // The case of part only being a single letter
        if (part.length() == 1) {

            char ch = Character.toLowerCase(part.charAt(0)); 


            StringBuilder sb = new StringBuilder(s);

            for(int i = 0 ; i < sb.length() ; i++){

                if (Character.toLowerCase(sb.charAt(i)) == ch) {

                    sb.deleteCharAt(i);
                    i--;
                    
                }

            }

            String ans = sb.toString();
            return ans;
            
        }

        StringBuilder sb = new StringBuilder(s);

        int i = 0;

        for(int j = 1 ; j < sb.length()+1 ; j++){

            boolean res = sb.substring(i, j).equals(part);

            
            // If u find the index
            if (res) {

                sb.delete(i, j);
                i = 0;
                j = 1;

            }


            if (j == sb.length()) {

                i++;
                j = i+1;
                
            }

            




        }

        String str = sb.toString();

        return str;
   
    }

    public static void main(String[] args) {

        RemoveAllOccuranceOfASubstring ro = new RemoveAllOccuranceOfASubstring();
        
        String s = "wwwwwwwwwwwwwwwwwwwwwvwwwwswxwwwwsdwxweeohapwwzwuwajrnogb";
        String part = "W";

        String ans = ro.removeOccurrences(s, part);

        System.out.println(ans);



    }
}
