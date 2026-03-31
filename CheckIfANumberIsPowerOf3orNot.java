import java.util.ArrayList;

public class CheckIfANumberIsPowerOf3orNot {
    
    public boolean checkPowersOfThree(int n) {

        boolean isPowerThree = true;

        ArrayList<Integer> lst = new ArrayList<>();

        // Making the lst of the tertionary numbers for the integer n
        int num = n;
        while (num > 0) {

            lst.add(num % 3);

            num = num/3;

        }

        // Checking if there is any two there
        for(int i = 0 ; i < lst.size() ; i++){

            if (lst.get(i) == 2) {

                isPowerThree = false;
                break;
                
            }
        }

        return isPowerThree;
    }

    public static void main(String[] args) {
        
        CheckIfANumberIsPowerOf3orNot cf = new CheckIfANumberIsPowerOf3orNot();

        int n = 21;

        boolean ans = cf.checkPowersOfThree(n);

        System.out.println(ans);
    }


}
