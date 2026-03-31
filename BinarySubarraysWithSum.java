import java.util.HashMap;

public class BinarySubarraysWithSum {
    
    public int numSubarraysWithSum(int[] nums, int goal) {

        int sum = 0;
        int[] prefSum = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
             
            sum = sum + nums[i];
            prefSum[i] = sum;

        }

        HashMap<Integer,Integer> hMap = new HashMap<>();
        hMap.put(0, 1);

        int cnt = 0;

        for(int i = 0; i < prefSum.length ; i++){

            if (hMap.containsKey(prefSum[i]-goal)) {

                cnt = cnt + hMap.get(prefSum[i]-goal);

            }

            if (hMap.containsKey(prefSum[i])) {

                hMap.put(prefSum[i], hMap.get(prefSum[i]) + 1);
                
            }
            else{

                hMap.put(prefSum[i], 1);

            }

        }

        return cnt;
        
    }


    public static void main(String[] args) {
        
        BinarySubarraysWithSum bs = new BinarySubarraysWithSum();

        int[] nums = {0,0,0,0,0};
        int goal = 0;

        int ans = bs.numSubarraysWithSum(nums, goal);

        System.out.println(ans);
    }
}
