import java.util.ArrayList;

public class MoveZeroes {
    
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

          
        int cnt = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] != 0) {

                list.add(nums[i]);
                cnt++;

                
            }

        }
        
        for(int i = 0 ; i < nums.length ; i++){

            if (i < cnt) {

                nums[i] = list.get(i);
                
            }
            else{

                nums[i] = 0;

            }

        }


        
    }

    public static void main(String[] args) {

        MoveZeroes mm = new MoveZeroes();
        
        int[] nums = {0};

        mm.moveZeroes(nums);

        for(int i = 0 ; i < nums.length ; i++){

            System.out.print(nums[i]+" ");

        }


    }
}
