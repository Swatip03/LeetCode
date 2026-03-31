import java.util.ArrayList;

public class CreateTargetArrayInGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> targetEle = new ArrayList<>();

        for(int i = 0 ; (i < index.length) && (i < nums.length) ; i++){

            targetEle.add(index[i],nums[i]);

        }
        
        Integer[] targetWrapper = targetEle.toArray(new Integer[0]);

        
        int[] target = new int[targetWrapper.length];

        for (int i = 0; i < targetWrapper.length; i++) {

            target[i] = targetWrapper[i];  

        }

        return target;
    }
     public static void main(String[] args) {

        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        
        CreateTargetArrayInGivenOrder cc = new CreateTargetArrayInGivenOrder();

        int[] target = cc.createTargetArray(nums, index);

        for (int element : target) {

            System.out.print(element + " ");

        }
     }   
    }

    


