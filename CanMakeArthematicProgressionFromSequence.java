import java.util.Arrays;

public class CanMakeArthematicProgressionFromSequence {
    
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int diff = arr[1]-arr[0];

        for(int i = 0 ; i < arr.length-1 ; i++){

            if (arr[i+1]-arr[i] != diff) {

               return false;
                
            }
        }
        
        return true;

    }

    public static void main(String[] args) {
        
        CanMakeArthematicProgressionFromSequence cmp = new CanMakeArthematicProgressionFromSequence();

        int[] arr = {2,1,4};
        
        boolean ans = cmp.canMakeArithmeticProgression(arr);

        System.out.println(ans);
    }
}
