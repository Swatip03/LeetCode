import java.util.HashMap;

import java.util.Stack;

public class ValidParantheses {
    
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();


        HashMap<Character,Character> hMap = new HashMap<>();
        hMap.put('(', ')');
        hMap.put('{', '}');
        hMap.put('[', ']');
        
        // i have to preserve the opening bracked and check if the current closing bracked is of the same
        // for this preserve all the opening bracket in the stack and if its match pop it out of the stack other wise leave it 

        for(int i = 0 ; i < s.length() ; i++){

            if (hMap.containsKey(s.charAt(i))) {      // The opening bracket is found

                 st.push(s.charAt(i));      
                
            }
            else{

                if (st.isEmpty()) {

                    return false;
                    
                }

               else if (hMap.get(st.peek()) == s.charAt(i)) {

                    st.pop(); 
                    
                }

                else{
                    return false;
                }
            }
        }


        if (st.isEmpty()) {

            return true;
            
        }


        return false;
    }


    public static void main(String[] args) {
        
        ValidParantheses vp = new ValidParantheses();

        String s = "))";

        boolean ans = vp.isValid(s);

        System.out.println(ans);
    }
}
