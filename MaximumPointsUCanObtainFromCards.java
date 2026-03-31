public class MaximumPointsUCanObtainFromCards {
    
    public int maxScore(int[] cardPoints, int k) {

        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;

        for(int i = 0 ; i < k ; i++){

            lsum = lsum + cardPoints[i];

        }

        maxSum = lsum;

        int rdx = cardPoints.length-1;
        
        for(int i = k-1 ; i >= 0 ; i--){

            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rdx];
            rdx = rdx - 1;

            maxSum = Math.max(maxSum, lsum + rsum);

        }



        return maxSum;
        
    }


    public static void main(String[] args) {
        

        MaximumPointsUCanObtainFromCards mp = new MaximumPointsUCanObtainFromCards();

        int[] cardPoints = {100,40,17,9,73,75};
        int k = 3;

        int ans = mp.maxScore(cardPoints, k);

        System.out.println(ans);

    }
}
