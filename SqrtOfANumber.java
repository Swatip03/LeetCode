public class SqrtOfANumber {
    
    public int mySqrt(int x) {

        if (x == 0) {

            return 0;
            
        }

        int target = x;

        int start = 1;
        int end = x;


        while (start <= end) {

            int mid = start + (end - start)/2;

            long midSquared = (long) mid*mid;

            if (midSquared == target) {

                return mid;
                
            }
            if (midSquared > target) {

                end = mid - 1;
                
            }
            if (midSquared < target) {

                start = mid + 1;
                
            }
            
        }


        return end;


















        // int target = x;

        // int start = 1;
        // int end = x;

        // while (start <= end) {

        //     int mid = (start + end)/2;

        //     long midSquared = (long) mid*mid;

        //     if (midSquared == target) {

        //         return mid;
                
        //     }
        //     if (midSquared > target) {

        //         end = mid - 1;
                
        //     }
        //     if (midSquared < target) {

        //         start = mid + 1;
                
        //     }
        //     if (midSquared < target && (long)(mid + 1)*(mid + 1) > target) {

        //         return mid;
                
        //     }
            
        // }


        // return 0;
        
    }

    public static void main(String[] args) {
        
        SqrtOfANumber ss = new SqrtOfANumber();

        int x = 12;

        int sqOfX = ss.mySqrt(x);

        System.out.println("Hence the square root of "+x+" is "+sqOfX);
    }
}
