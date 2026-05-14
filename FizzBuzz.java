import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public List<String> fizzBuzz(int n) {

        List<String> lst = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){

            if (i % 3 == 0 && i % 5 != 0) {

                lst.add("Fizz");
                
            }

            else if (i % 5 == 0 && i % 3 != 0) {

                lst.add("Buzz");
                
            }

            else if (i % 3 == 0 && i % 5 == 0) {

                lst.add("FizzBuzz");
                
            }

            else{

                lst.add(i+"");

            }

        }

        return lst;

        
    }


    public static void main(String[] args) {
        
        FizzBuzz fb = new FizzBuzz();
        int n = 15;

        List<String> ans = fb.fizzBuzz(n);

        System.out.println(ans);

    }
}
