
import java.util.Arrays;
import java.util.Stack;

public class AsteriodCollision {
    
    public int[] asteroidCollision(int[] asteroids) {

        // Use a lifo data structure to keep track of all the positive element in the array
        // The monotonicity is that u have to store only the positive element and then keep track of the negative element that comes along the way

        Stack<Integer> stk = new Stack<>();

        for(int i = 0 ; i < asteroids.length ; i++){

            int curr = asteroids[i];
            boolean destroyed = false;

            while (!stk.isEmpty() && curr < 0 && stk.peek() > 0) {

                if (stk.peek() < -curr) {

                    stk.pop();
                    
                }
                else if (stk.peek() == -curr) {

                    stk.pop();
                    destroyed = true;
                    break;
                    
                }

                else{

                    destroyed = true;
                    break;

                }
                
            }

            if (!destroyed) {

                stk.push(curr);
                
            }

        }

        int[] ans = new int[stk.size()];

        for(int i = ans.length-1 ; i >= 0 ; i--){

            ans[i] = stk.peek();
            stk.pop();

        }

        return ans;
 
    }


    public static void main(String[] args) {

        AsteriodCollision ac = new AsteriodCollision();

        int[] asteroids = {8,-8};

        int[] ans = ac.asteroidCollision(asteroids);

        System.out.println(Arrays.toString(ans));
        

    }
}
