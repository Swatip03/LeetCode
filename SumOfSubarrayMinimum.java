import java.util.*;

public class SumOfSubarrayMinimum {

    public int[] findNSE(int[] arr){

        int[] nse = new int[arr.length];  // Make a array
        Stack<Integer> stk = new Stack<>();    // Initialize a array

        for(int i = arr.length-1 ; i >= 0 ; i--){

            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {

                stk.pop();
                
            }

            if (stk.isEmpty()) {

                nse[i] = arr.length;
                
            }

            else{

                nse[i] = stk.peek();

            }

            stk.push(i);

        }

        return nse;


    }

    public int[] findPSEE(int[] arr){ // ELements preveios smaller as well as equal to ensure the edge cases

        int[] pse = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++){

            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {

                stk.pop();
                
            }

            if (stk.isEmpty()) {

                pse[i] = -1;

                
            }
            else{

                pse[i] = stk.peek();

            }

            stk.push(i);            // Push the index of the element rather than the element

        }

        return pse;
    }


     
    public int sumSubarrayMins(int[] arr) {

        // The brute force approach

        // int sum = 0;

        // for(int i = 0 ; i < arr.length ; i++){

        //     int min = arr[i];

        //     for(int j = i ; j < arr.length ; j++){

        //         min = Math.min(min, arr[j]);
        //         sum = sum + min;

        //     }

            

        // }

        // return sum;



        // The optimal approach in this we will be finding the index of previous smaller element and next smaller element
        // and then after finding the contribution of each element we will calculate the sum of subarray minimums

        
        // Finding the length of next smaller element

        int[] nse = findNSE(arr);
        int[] pse = findPSEE(arr);

        int total = 0;
        int mod = (int)(1e9 + 7);

        for(int i = 0 ; i < arr.length ; i++){

            int left = i - pse[i];
            int right = nse[i] - i;

            long contrib = ((long)right * left) % mod;
            contrib = (contrib * arr[i]) % mod;
            total = (int)((total + contrib) % mod);


        }

        return total;
        
        
    }

    public static void main(String[] args) {
        
        SumOfSubarrayMinimum ss = new SumOfSubarrayMinimum();

        int[] arr = {11,81,94,43,3};

        int ans = ss.sumSubarrayMins(arr);

        System.out.println(ans);
    }
}
