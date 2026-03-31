import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutations {

    public void helpr(int[] nums , boolean[] freq , List<List<Integer>> list , List<Integer> lst){

        if (lst.size() == nums.length) {

            list.add(new ArrayList<>(lst));
            return;
            
        }


        for(int i = 0 ; i < nums.length ; i++)

            if (!freq[i]) {

                freq[i] = true;
                lst.add(nums[i]);
                helpr(nums, freq, list, lst);
                lst.remove(lst.size()-1);
                freq[i] = false;
                
            }

        }

    }
    
    public void nextPermutation(int[] nums) {

        List<Integer> toFind = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            toFind.add(nums[i]);

        }

        boolean[] freq = new boolean[nums.length];
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);

        helpr(nums, freq, list, lst);

        int idx = 0;

        for(int j = 0 ; j < list.size() ; j++){

            if (list.get(j).equals(toFind)) {

                idx = j;
                break;
                
            }

        }

        // converting the given nums to the next permutation
        for(int i = 0 ; i < nums.length ; i++){

            if(idx == list.size()-1){

                nums[i] = list.get(0).get(i);

            }else{

                nums[i] = list.get(idx+1).get(i);

            }

            

        }


        
    }

    public static void main(String[] args) {
        
        NextPermutations np = new NextPermutations();

        int[] nums = {1,1,5};

        np.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));


    }
}
