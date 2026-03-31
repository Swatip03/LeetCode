
import java.util.Arrays;

public class RankTransFormOfAnArray {
    
    public int[] arrayRankTransform(int[] arr) {

        int[] ans = new int[arr.length];

        int[] nums = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){

            nums[i] = arr[i];

        }

        Arrays.sort(nums);


        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < nums.length ; j++){

                if (arr[i] == nums[j]) {

                    ans[i] = j+1;
                    break;
                    
                }
            }
        }




        return ans;
        
    }

    public static void main(String[] args) {
        
        RankTransFormOfAnArray rt = new RankTransFormOfAnArray();

        int[] arr = {100,100,100};
        int[] ans = rt.arrayRankTransform(arr);

        System.out.println(Arrays.toString(ans));
    }
}
