import java.util.Arrays;

public class CountNumberOfBadPairs {

    // See here we have to count the bad pairs now the intuition is couont the good pair and subtract it from the total number of possible selection
    // Now since j-i != nums[j]-nums[i]
    // By rearranging this we can get nums[j]-j != nums[i]-i // then good pair will be nums[j]-j == nums[i]-i
    // then we have just to a array in which nums[j]-j count how many make  pairs are there

    
    public long countBadPairs(int[] nums) 

        int n = nums.length;
        
        long total = (n*(n-1))/2;

        // to find the number of good pairs in which two nums[j]-j will be same

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = nums[i]-i;

        }

        Arrays.sort(arr);

        long numOfGood = 0;

        for(int i = 0 ; i < nums.length-1 ; i++){

            if (arr[i] == arr[i+1]) {

                numOfGood++;
                
            }


        }



       long ans = total - numOfGood;

       return ans;



        
    }


    public static void main(String[] args) {
        
        CountNumberOfBadPairs cnb = new CountNumberOfBadPairs();

        int[] nums = {64,6,81,7,16,15,99,47,56,39,91,85,34,24,77,99,77,11,64,63,83,5,28};

        long ans = cnb.countBadPairs(nums);

        System.out.println(ans);
    }
}
