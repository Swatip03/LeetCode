public class FindTheDifference {
    
    public char findTheDifference(String s, String t) {

        for(int i = 0 ; i < t.length() ; i++){

            boolean isVisited = false;

            for(int j = 0 ; j < s.length() ; j++){

                if (t.charAt(i) == s.charAt(j)) {

                    isVisited = true;
                    break;
                    
                }


            }


            if (!isVisited) {

                return t.charAt(i);
                
            }
        }

        return '0';
        
    }

    public static void main(String[] args) {
        
        String s = "a";
        String t = "aa";

        FindTheDifference fd = new FindTheDifference();

        char ans = fd.findTheDifference(s, t);

        System.out.println(ans);

    }
}
