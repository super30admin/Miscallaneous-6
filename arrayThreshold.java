// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// We sort the array so that we can adjust the excess from the numbers to the other numbers coming after that number in the array.
// Traverse nums and if the threshold is greater than the number we increase the threshold by the difference distributed
// equally among the greater elements.
import java.io.*;
import java.util.Arrays;

class Threshold {
    private static double getThreshold(int[] nums, int desiredSum) {
        // initial threshold calculation
        Arrays.sort(nums);
        int n = nums.length;
        double threshold = (double)desiredSum/n;
        for (int i=0; i<n; i++) {
            if (nums[i] < threshold) {
                threshold = threshold + (threshold-nums[i])/(n-i-1);
            }
        }

        return threshold;
    }

    public static void main (String[] args) {
        Threshold obj = new Threshold();

        System.out.println(obj.getThreshold(new int[]{2,1,5}, 6));
        System.out.println(obj.getThreshold(new int[]{2,1,5}, 3));
        System.out.println(obj.getThreshold(new int[]{2,1,5}, 2));
        System.out.println(obj.getThreshold(new int[]{2,1,5}, 4));
        System.out.println(obj.getThreshold(new int[]{2,1,5}, 1));
    }
}