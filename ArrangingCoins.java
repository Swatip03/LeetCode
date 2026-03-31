public class ArrangingCoins {
    

    public int arrangeCoins(int n) {

        long start = 1;
        long end = n;

        long target = n;

        while (start <= end) {

            long mid = start + (end - start)/2;

            long sumOfEleInMidNoOfStairs = ( mid*(mid+1))/2;

            if (sumOfEleInMidNoOfStairs == target) {

                return (int) mid;
                
            }

            if (sumOfEleInMidNoOfStairs > target) {

                end = mid - 1;
                
            }

            if (sumOfEleInMidNoOfStairs < target) {

                start = mid + 1;
                
            }

            
        }
        

        return (int) end;
    }

    public static void main(String[] args) {
    
        ArrangingCoins aa = new ArrangingCoins();

        int numOfStairsOccupied = aa.arrangeCoins(1804289383);

        System.out.println(numOfStairsOccupied);
    }
}
