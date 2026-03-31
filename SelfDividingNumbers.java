import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public boolean checkSelfDiviNum(int N){

        int num = N;

        while (num > 0) {

            int digit = num % 10;

            if ((digit == 0) || (N % digit != 0)) {

                return false;
                
            }

            num = num/10;
            
        }

        return true;
    }
    
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> lst = new ArrayList<>();

        for(int i = left ; i <= right ; i++){

            if (checkSelfDiviNum(i)) {

                lst.add(i);
                
            }

        }

        return lst;
        
    }


    public static void main(String[] args) {
        
        SelfDividingNumbers sdn = new SelfDividingNumbers();

        int left = 47;
        int right = 85;

        List<Integer> ans = sdn.selfDividingNumbers(left, right);

        System.out.println(ans);
    }
}
