import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    
    public int[] twoSum(int[] numbers, int target) {

        int[] index = new int[2];

        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {

            int sum = numbers[start] + numbers[end];

            if ( sum == target) {

                index[0] = start+1;
                index[1] = end+1;

                return index;
                
            }


            else if (sum > target) {

                end--;
                
            }

            else{

                start++;
                
            }
            
        }



        return index;

        
    }


    public static void main(String[] args) {

        TwoSumInputArrayIsSorted tt = new TwoSumInputArrayIsSorted();

        int[] numbers = {2,7,11,15};

        int target = 9;

        int[] indices = tt.twoSum(numbers, target);

        System.out.println(Arrays.toString(indices));

    }
}
