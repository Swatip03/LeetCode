public class RemoveTheOutermostParenthesis {
    
    public String removeOuterParentheses(String s) {

        int cnt = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){

            if (s.charAt(i) == ')') {

                cnt--;
                
            }

            if (cnt != 0) {

                sb.append(s.charAt(i));
                
            }

            if (s.charAt(i) == '(') {

                cnt++;
                
            }

        }


        String ans = sb.toString();

        return ans;
        
    }

    public static void main(String[] args) {
        
        RemoveTheOutermostParenthesis rt = new RemoveTheOutermostParenthesis();

        String s = "()()";

        String ans = rt.removeOuterParentheses(s);

        System.out.println(ans);


    }
}
