import java.util.ArrayList;
import java.util.Arrays;

public class PartitionArrayAccordingToThePivot {
    
    public int[] pivotArray(int[] nums, int pivot) {

        // The idea is u have to arrange the element inside the array as less than greater than and equal one

        ArrayList<Integer> lstSmall = new ArrayList<>();
        ArrayList<Integer> lstGreat = new ArrayList<>();
        ArrayList<Integer> lstEqual = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] < pivot) {

                lstSmall.add(nums[i]);
                
            }
            else if (nums[i] > pivot) {

                lstGreat.add(nums[i]);
                
            }
            else{

                lstEqual.add(nums[i]);

            }

        }

        int[] arr = new int[nums.length];
        int idx = 0;

        for(int i = 0 ; i < lstSmall.size() ; i++){

            arr[idx] = lstSmall.get(i);
            idx++;

        }

        for(int j = 0 ; j < lstEqual.size() ; j++){

            arr[idx] = lstEqual.get(j);
            idx++;

        }

        for(int k = 0 ; k < lstGreat.size() ; k++){

            arr[idx] = lstGreat.get(k);
            idx++;

        }


        return arr;

        
    }

    public static void main(String[] args) {
        
        PartitionArrayAccordingToThePivot pa = new PartitionArrayAccordingToThePivot();

        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;

        int[] ans = pa.pivotArray(nums, pivot);

        System.out.println(Arrays.toString(ans));


    }
}
