

import java.util.*;
public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
         //First part take the elements of nums and push it into hashmap such that
         //it creates a pair of (ele : freq)    
         int n = nums.length;
         HashMap<Integer,Integer> hmap = new HashMap<>();
         for(int i = 0 ; i < n ; i++){
            if (hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }else{
                hmap.put(nums[i], 1);
            }
        }

        //Now putting these pairs in the priority queue & the pairs are sorted in the frequency wise order
        //Min heap keeps the least frequent on top so it gets kicked out first when someone better comes along
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);


        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});

            if (pq.size() > k) {   //Remove the element when its size gets bigger than the k
                pq.poll();
            }
        }

        //Now answer of the problem since we have to find the k frequent element
        int[] ans = new int[k];
        for(int i = 0; i < k ; i++){
            ans[i] = pq.poll()[0];
        }
         
        return ans;
    }
}
