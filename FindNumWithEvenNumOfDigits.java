public class FindNumWithEvenNumOfDigits {
    public int findNumbers(int[] nums) {

        int numOfEveDigit = 0;

        for(int i = 0 ; i < nums.length ; i++){

            int ele = nums[i];

            int count = 0;
            while (ele > 0) {

                ele = ele / 10;
                count++;
                
            }

            if (count % 2 == 0) {

                numOfEveDigit++;
                
            }

        }

        return numOfEveDigit;
        
    }

    public static void main(String[] args) {
        
        FindNumWithEvenNumOfDigits ff = new FindNumWithEvenNumOfDigits();

        int[] nums = {555,901,482,1771};

        int ans = ff.findNumbers(nums);

        System.out.println("The numbers wwith even number of digits is "+ans);
    }
}
