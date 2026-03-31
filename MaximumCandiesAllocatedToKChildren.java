

public class MaximumCandiesAllocatedToKChildren {
    
    public int maximumCandies(int[] candies, long k) {

        // See u are thinking in wrong direction of upperbound
        // Use binary search bro and try to form a sorted sequence no matter what

        long sum = 0;

        for(int i = 0 ; i < candies.length ; i++){

            sum = sum + candies[i];

        }

        long left = 1;
        long right = (sum/k);
        long ans = 0;

        while (left <= right) {

            long mid = (left + right)/2;

            if (mid == 0) {

                return 0;
                
            }

            long cnt = 0;

            for(int i = 0 ; i < candies.length ; i++){

                long x = candies[i];
                cnt = cnt + (x/mid);

            }

            if (cnt >= k) {

                ans = mid;
                left = mid+1;          // Try for a larger size
                
            }
            else{

                right = mid-1;          // Reduce the size

            }

            


            
        }

        return (int) ans;


        
    }


    public static void main(String[] args) {
        
        MaximumCandiesAllocatedToKChildren mc = new MaximumCandiesAllocatedToKChildren();

        int[] candies = {2,5};
        long k = 11;

        int ans = mc.maximumCandies(candies, k);

        System.out.println(ans);
    }
}
