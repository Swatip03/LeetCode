import java.util.PriorityQueue;

public class KthLargestElementInTheArray {
    
    public int findKthLargest(int[] nums, int k) {

        // One method for solving this question is to do the sorting which will take the time complexity of nlogn

        // The other one is the priority queue approcach

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0 ; i < nums.length ; i++){

            minHeap.offer(nums[i]);

            if (minHeap.size() > k) {

                minHeap.poll();
                
            }
               
        }
        
        return minHeap.peek();
    }

    public static void main(String[] args) {
        
        KthLargestElementInTheArray kt = new KthLargestElementInTheArray();

        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        int ans = kt.findKthLargest(nums, k);


        System.out.println(ans);
    }
}
