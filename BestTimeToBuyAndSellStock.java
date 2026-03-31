public class BestTimeToBuyAndSellStock {
    
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;

        int maxProfit = 0;

        while (right < prices.length) {

            if (prices[right] > prices[left]) {

                int profit = prices[right] - prices[left];

                if (maxProfit < profit) {

                    maxProfit = profit;
                    
                }
                
            }
            else if (prices[right] < prices[left]) {

                left = right;       // We want to move this left pointer not just to the left++ but we have to move it all the way to the minimum price
                
            }

            right++;
            
        }



        return maxProfit;
        
        
    }


    public static void main(String[] args) {

        BestTimeToBuyAndSellStock bb = new BestTimeToBuyAndSellStock();
        
        int[] prices = {7,1,5,3,6,4};

        int maxProfit = bb.maxProfit(prices);

        System.out.println(maxProfit);
    }
}

