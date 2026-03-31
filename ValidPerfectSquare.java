public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {

        
        if (num == 0) {

            return true;
            
        }

        int start = 1;
        int end = num;

        int target = num;

        while (start <= end) {

            int mid = start + (end - start)/2;

            long midSquared = (long) mid*mid;

            if (midSquared == target) {

                return true;
                
            }
            if (midSquared > target) {

                end = mid - 1;
                
            }
            if (midSquared < target) {

                start = mid + 1;
                
            }
            
        }

        

        return false;
    }


    public static void main(String[] args) {

        ValidPerfectSquare vv = new ValidPerfectSquare();

        boolean isPerfecSq = vv.isPerfectSquare(0);

        System.out.println(isPerfecSq);
    }
    
}



                                               