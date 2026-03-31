import java.util.*;

public class ValidParenthesisString {
    
    public boolean checkValidString(String s) {

        // See in this problem the position matters a lot and that is why we have to create two stacks one two store ( and other *
        // and thus the stack will be of integer type

        Stack<Integer> open = new Stack<>();  // To store (
        Stack<Integer> star = new Stack<>();  // To store *

        for(int i = 0 ; i < s.length() ; i++){

            if (s.charAt(i) == '(') {

                open.push(i);
                
            }

            else if (s.charAt(i) == '*') {

                star.push(i);
                
            }

            else{

                if (!open.isEmpty()) {

                    open.pop();
                    
                }

                else if (!star.isEmpty()) {

                    star.pop();
                    
                }

                else{

                    return false;

                }
            }
        }


        // Now try to match the remaining ( and * the position of them'

        while (!open.isEmpty() && !star.isEmpty()) {

            if (open.peek() < star.peek()) {

                open.pop();
                star.pop();
                
            }
            else{

                break;

            }
            
        }

        return open.isEmpty();         // if open stack is empty then it is valid // no need to chk the star one

        
    }

    public static void main(String[] args) {
        
        ValidParenthesisString vp = new ValidParenthesisString();

        String s = "(*))";

        boolean ans = vp.checkValidString(s);

        System.out.println(ans);
    }
}
