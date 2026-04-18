import java.util.*;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        // 1. Calculate diff = gas[i] - cost[i] at each station
        // 2. If tank goes negative → reset and start from next station
        // 3. If total of all diffs < 0 → return -1, else return startIdx

        int n = gas.length;
        int[] diff = new int[n];
        int currGas = 0;
        int strtIdx = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = gas[i] - cost[i]; // Storing the differneneces
            currGas += gas[i] - cost[i]; // checking currents journey

            // if tank goes negative, can't start from startIdx
            // so reset and try starting from next station
            if (currGas < 0) {
                strtIdx = i + 1;
                currGas = 0;
            }
        }

        int totalGas = 0;
        for (int ele : diff) {
            totalGas += ele;
        }

        if (totalGas < 0) {
            return -1;
        } else {
            return strtIdx;
        }

    }

    public static void main(String[] args) {

    }

}
