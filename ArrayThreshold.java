import java.util.Arrays;

/**
 * Given a list of integers and desiredSum,
 * find the threshold value such that if we replace all the values in the input list which are greater than threshold value with the threshold value
 * then the sum of the list should be equal to the desired sum.
 * Testcase 1 in = [2,1,5] desiredSum = 6 output = 3
 * Testcase 2 in = [2,1,5] desiredSum = 2 output = 0.67
 * Testcase 3 in = [2,1,5] desiredSum = 4 output = 1.5
 * Testcase 4 in = [2,1,5] desiredSum = 1 output = 0.33
 */
public class ArrayThreshold {

    /**
     * Initial potential threshold = target sum / n;
     * <p>
     * Try to distribute the gap in threshold among the remaining elements
     * and then check if the threshold holds true to give the desired target.
     * <p>
     * because the smaller elements cannot contribute more than their face value,
     * whereas the greater elements can contribute less than their face value
     * <p>
     * TC: O(n log n) due to sorting
     * SC: O(1)
     *
     * @param nums
     * @return
     */
    public float calculate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        float threshold = 0;
        for (int num : nums) {
            threshold += num;
        }
        threshold /= n;

        int i = 0;
        while (i < n && threshold > nums[i]) {
            float gap = threshold - nums[i];
            float addOn = gap / (n - i - 1);
            threshold += addOn;
            i++;
        }

        return threshold;
    }
}
