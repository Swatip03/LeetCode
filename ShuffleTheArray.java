public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];

        for(int i = 0 ; i < n ; i++){

            arr[2*i] = nums[i];
            arr[2*i + 1] = nums[i+n]; 

        }

        return arr;
        
    }

    public static void main(String[] args) {
        
        int[] nums = {2,5,1,3,4,7};

        int n = (nums.length) / 2;

        ShuffleTheArray s = new ShuffleTheArray();

        int[] arr = s.shuffle(nums, n);

        System.out.print("[");

        for(int i = 0 ; i < arr.length ; i++){

            System.out.print(arr[i]);

            if (i < arr.length - 1) {

                System.out.print(",");
                
            }

        }

        System.out.print("]");
    }

    
}
