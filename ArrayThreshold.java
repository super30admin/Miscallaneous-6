// Time Complexity : O(N * logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        int[] a = new int[] {1, 2, 5};
        System.out.println(calculateThreshold(a, 7));
    }
    
    private static float calculateThreshold(int[] nums, int desiredSum) {
        
        float n = nums.length;
        float threshold = desiredSum / n;
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++) {
            if(threshold > nums[i]) {
                float diff = threshold - nums[i];
                threshold += diff/(n - i - 1);
            }
        }
        return threshold;
    }
}