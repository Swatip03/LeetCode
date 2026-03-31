public class NumberOfSubArrWithOddSum {
    
    public int numOfSubarrays(int[] arr) {

        int MOD = 1000000007;

        int cnt = 0;
        int prefixSum = 0;
        int even = 1;
        int odd = 0;

        for(int i = 0; i < arr.length ; i++){

            prefixSum = prefixSum + arr[i];

            if (prefixSum % 2 != 0) {

                cnt = cnt + even;
                odd++;
                
            }
            else{

                cnt = cnt + odd;
                even++;

            }

            cnt = cnt % MOD;

        }

        return cnt;
        
    }

    public static void main(String[] args) {
        
        NumberOfSubArrWithOddSum ns = new NumberOfSubArrWithOddSum();

        int[] nums = {1,2,3,4,5,6,7};

        int ans = ns.numOfSubarrays(nums);

        System.out.println(ans);
    }


    

}
