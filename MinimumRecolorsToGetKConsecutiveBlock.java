public class MinimumRecolorsToGetKConsecutiveBlock {
    
    public int minimumRecolors(String blocks, int k) {

        char[] chArr = blocks.toCharArray();
        int n = chArr.length;

        int minCnt = Integer.MAX_VALUE;

        for(int i = 0 ; i < n-k+1 ; i++){

            int cnt = 0;

            for(int j = i + (k-1) ; j >= i ; j--){

                if (chArr[j] == 'W') {

                    cnt++;
                    
                }

            }
            
            if (minCnt > cnt) {

                minCnt = cnt;
                
            }
            
        }


        return minCnt;
        
    }

    public static void main(String[] args) {
        
        MinimumRecolorsToGetKConsecutiveBlock mr = new MinimumRecolorsToGetKConsecutiveBlock();

        String blocks = "WBWBBBW";
        int k = 2;

        int ans = mr.minimumRecolors(blocks, k);

        System.out.println(ans);

    }
}
