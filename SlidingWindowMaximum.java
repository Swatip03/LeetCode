import java.util.*;

public class SlidingWindowMaximum {
    
    public int[] maxSlidingWindow(int[] nums, int k) {

        // In this question we will be using sliding window with priyority queue or max heap
        // But while traversing the array we have to keep in mind about the fixed size window

        ArrayList<Integer> lst = new ArrayList<>();
        Deque<Integer> dqe = new LinkedList<>();

        for(int i = 0 ; i < k ; i++){

            while (!dqe.isEmpty() && dqe.peekFirst() < nums[i]) 

                dqe.pollFirst();
                
            }

            dqe.addLast(nums[i]);

        }

        lst.add(dqe.peek());

        


        int i = 0 ; 
        int j = k-1;

        while (j < nums.length-1) {

            i++;
            j++;

        
            while (!dqe.isEmpty() && dqe.peekFirst() < nums[j]) {

                dqe.pollFirst();
                
            }

            dqe.addLast(nums[j]);

            lst.add(dqe.peekFirst());

            
        }

        int[] ans = new int[lst.size()];

        for(int l = 0 ; l < ans.length ; l++){

            ans[l] = lst.get(l);

        }
        
        return ans;
    }


    public static void main(String[] args) {
        
        SlidingWindowMaximum sw = new SlidingWindowMaximum();

        int[] nums = {1};
        int k = 1;


        int[] ans = sw.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(ans));


    }
}
