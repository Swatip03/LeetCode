import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    
    public int[] nextGreaterElements(int[] nums) {

        // Hey in this problem we are going to use the concept of circular array with the monotonic stack concept
        // The circular conept is nothing but assuming that length of the array si doubled

        int[] nge = new int[nums.length];

        Stack<Integer> stk = new Stack<>();

        for(int i = 2*nums.length-1 ; i >= 0 ; i--){

            while (!stk.isEmpty() && nums[i % nums.length] >= stk.peek()) {

                stk.pop();
                
            }

            if (i < nums.length) {

                if (stk.isEmpty()) {

                    nge[i % nums.length] = -1;
                    
                }
                else{

                    nge[i % nums.length] = stk.peek();

                }
                
            }

            stk.push(nums[i % nums.length]);



        }

        return nge;
        
    }

    public static void main(String[] args) {
        
        NextGreaterElementII ng = new NextGreaterElementII();

        int[] nums = {1,2,1};

        int[] ans = ng.nextGreaterElements(nums);

        System.out.println(Arrays.toString(ans));


    }

}
