public class CheckIfOneStringSwapCanMakeStringsEqual {

    public String afterSwap(String str , int i , int j){
 
        char[] ch = str.toCharArray();
         
        StringBuilder sb = new StringBuilder();

        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        for(int k = 0 ; k < ch.length ; k++){

            sb.append(ch[k]);

        }

        String ans = sb.toString();
        


       return ans;


    }

    
    public boolean areAlmostEqual(String s1, String s2) {

        // First check if both the string are same

        if (s1.equals(s2)) {

            return true;
            
        }


        // To check after swaping in the string 1st

        for(int i = 0 ; i < s1.length() ; i++){

            for(int j = i + 1 ; j < s1.length() ; j++){

                String st1 = afterSwap(s1, i, j);

                if (st1.equals(s2)) {

                    return true;
                    
                }

            }
        }

        
        // To check after swaping in the string 1st

        for(int i = 0 ; i < s2.length() ; i++){

            for(int j = i + 1 ; j < s2.length() ; j++){

                String st2 = afterSwap(s2, i, j);

                if (st2.equals(s1)) {

                    return true;
                    
                }

            }
        }

        



       return false;
        
    }


    public static void main(String[] args) {
        
        CheckIfOneStringSwapCanMakeStringsEqual co = new CheckIfOneStringSwapCanMakeStringsEqual();

        String s1 = "attack";
        String s2 = "defend";

        boolean ans = co.areAlmostEqual(s1, s2);

        System.out.println(ans);
    }
}
