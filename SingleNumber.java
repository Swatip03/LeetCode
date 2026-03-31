import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber {
    
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        

        ArrayList<Integer> list = new ArrayList<>();


        int sum = 0;

        for(int i = 0 ; i < n-1 ; i++){

            sum = sum + nums[i];

            if (nums[i] == nums[i+1]) {

                list.add(nums[i]);

            }

        }

        sum = sum + nums[nums.length - 1];


        int sumOfPairEle = 0;

        for(int j = 0; j < list.size() ; j++){

            sumOfPairEle = sumOfPairEle + list.get(j);

        }


        int singNum = sum - (2*sumOfPairEle);





        return singNum;

    }



    public static void main(String[] args) {
        
        SingleNumber ss = new SingleNumber();

        int[] nums = {1};

        int singNum = ss.singleNumber(nums);


        System.out.println(singNum);

    }
}
