import java.util.ArrayList;
import java.util.Arrays;

public class MinimumOperationToExceedFromTheThreshholdPart2 {

    public boolean isGreater(ArrayList<Integer> lst , int k){

        int cnt = 0;
        boolean isGreater = false;

        for(int i = 0 ; i < lst.size() ; i++){

            if (lst.get(i) < k) {

                cnt++;
                
            }

        }


        if (cnt == 0) {

            isGreater = true;
            
        }

        return isGreater;

    }

    public ArrayList<Integer> sort(ArrayList<Integer> lst ){

        int[] arr = new int[lst.size()];

        for(int i = 0 ; i < lst.size() ; i++){

            arr[i] = lst.get(i);

        }


        Arrays.sort(arr);

        ArrayList<Integer> arrLst = new ArrayList<>();

        for(int j = 0 ; j < arrLst.size() ; j++){

            arrLst.add(arr[j]);

        }

        return arrLst;

    }
    
    public int minOperations(int[] nums, int k) {

        /*Take the two smallest integers x and y in nums.
Remove x and y from nums.
Add min(x, y) * 2 + max(x, y) anywhere in the array. */




    ArrayList<Integer> lst = new ArrayList<>();

    int maxNoOfOp = 0;

    for(int i = 0 ; i < nums.length ; i++){

        if (nums[i] < k) {

            maxNoOfOp++;
            
        }

    }


    for(int i = 0 ; i < nums.length ; i++){

        lst.add(nums[i]);

    }


    while (!isGreater(lst, k)) {


        ArrayList<Integer> list = sort(lst);

        int secLast = 1;
        int last = 0;

        list.remove(list.get(secLast));
        list.remove();

        lst.add()

        


        
    }

    


        
    }
}
