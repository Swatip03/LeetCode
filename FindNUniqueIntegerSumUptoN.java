import java.util.Random;

public class FindNUniqueIntegerSumUptoN {
    
    public int[] sumZero(int n) {

        int[] arr = new int[n];
        

        Random random = new Random();

            for(int i = 0 ; i < n ; i++){

                arr[i] = random.nextInt(10) -5;

            }

            
        

        return arr;

         
    }


    public boolean isSumEqualTo0(int[] arr){

        int n = arr.length;

        int sum = 0;
        int cnt = 0;

        while (cnt < n) {

            sum = sum + arr[cnt];

            cnt++;
            
        }

        if (sum == 0) {

            return true;
            
        }


        return false;
    }

    public boolean isUnique(int[] arr){

        int n = arr.length;

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n ; j++){

                if (arr[i] == arr[j] && i!=j) {

                    return false;
                    
                }

            }

        }

        return true;

    }


    public static void main(String[] args) {
        
        FindNUniqueIntegerSumUptoN ff = new FindNUniqueIntegerSumUptoN();

        int n = 5;

        int[] arr = ff.sumZero(n);

        

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
