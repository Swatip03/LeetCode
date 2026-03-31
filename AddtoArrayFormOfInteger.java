import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormOfInteger {
    
    public List<Integer> addToArrayForm(int[] num, int k) {

        int n = num.length;

        List<Integer> lst = new ArrayList<>();

        int carry = 0;

        for(int i = 0 ; i < n ; i++){

            int sum = num[n-1-i] + k % 10 + carry;

            lst.add(sum % 10);

            carry = sum / 10;

            k = k / 10;

        }

        // Handle the remaining value of carry or k 

        while (k > 0 || carry > 0) {

            int sum = k % 10 + carry;
            lst.add(sum%10);
            carry = sum /10;
            k = k/10;
            
        }

        List<Integer> ansLst = new ArrayList<>();

        for(int i = 0 ; i < lst.size() ; i++){

            ansLst.add(lst.get(lst.size()-1-i));

        }


        return ansLst;
        
    }

    public static void main(String[] args) {

        AddtoArrayFormOfInteger aa = new AddtoArrayFormOfInteger();
        
        int[] num = {9,9,9,9,9,9,9,9,9};
        int k = 1;

        List<Integer> lst = aa.addToArrayForm(num, k);

        System.out.println(lst);
    }
}
