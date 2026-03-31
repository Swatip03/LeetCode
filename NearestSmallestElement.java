import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallestElement {
    
     public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {

        // For this question it is same as the next greater element

        Stack<Integer> stk = new Stack<>();

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i < A.size() ; i++){

            while (!stk.isEmpty() && stk.peek() > A.get(i)) {

                stk.pop();
                
            }

            if (stk.isEmpty()) {

                lst.add(-1);
                
            }
            else{

                lst.add(stk.peek());

            }

            stk.push(A.get(i));

        }

        return lst;
        
        
    }

    public static void main(String[] args) {
        
        NearestSmallestElement nse = new NearestSmallestElement();

        ArrayList<Integer> A = new ArrayList<>();

        int[] arr = {3,2,1};

        for(int i = 0 ; i < arr.length  ; i++){

            A.add(arr[i]);

        }

        ArrayList<Integer> ans = nse.prevSmaller(A);

        System.out.println(ans);
        
    }
}
