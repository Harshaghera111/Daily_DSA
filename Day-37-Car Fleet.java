// 853. Car Fleet
//Time Complexity: O(n log n) due to sorting
import java.util.*;

class Solution {

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        double[][] cars = new double[n][2];

        // store position and time
        for(int i = 0; i < n; i++) {

            cars[i][0] = position[i];

            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // sort by position
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));

        int fleets = 0;

        double prevTime = 0;

        // process from right to left
        for(int i = n - 1; i >= 0; i--) {

            double currTime = cars[i][1];

            // new fleet
            if(currTime > prevTime) {

                fleets++;

                prevTime = currTime;
            }
        }

        return fleets;
    }
}