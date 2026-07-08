package GreedyProb;

import java.util.Arrays;

public class FractionalKnapSack {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;

        //Pair up val and wt , sort by val/wt ration descending first
        double[][] items = new double[n][2];
        for(int i = 0 ; i < n ; i++){
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }

        Arrays.sort(items,(a,b) -> Double.compare(b[0]/b[1], a[0]/a[1]));

        double cost = 0;

        for(int i = 0 ; i < n ; i++){
            double v = items[i][0];
            double w = items[i][1];

            if (w <= capacity) {  //take whole item
                cost += v;
                capacity -= w;
            }else{     //take fraction
                 cost += (capacity/w)*v;
                 break;        //since knapsack full , break the loop
            }
        }

        return cost;
    }
}
