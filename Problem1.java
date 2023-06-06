import java.util.Arrays;

/*
Array Threshold
approach:
1. we sort the array, get the sum, desiredSum/elements would be the probable threshold. at each index we get the contribution
of that element (subtract curr element from probable threshold) and divide it equally among left elements. the index at which
the curr threshold less than curr element that is our required threshold.
2. keep track of sum, prev element and at each element check if currSum+(curr elem * elements left) is exceeding desSum, if yes
then subtract prevSum from desSum and divide it by elements left excluding current element else continue
time: O(n log n)
space: O(1)
 */
public class Problem1 {
    private float findThreshold(int desiredSum, int[] nums) {
        Arrays.sort(nums);
        int csum = nums[0], elementsLeft = nums.length-1;
        for (int i=1;i< nums.length;i++) {
            int curr = nums[i];
            if (csum+(curr*elementsLeft)>desiredSum) {
                return (float) (desiredSum-csum)/(elementsLeft);
            }
            csum+=curr;
            elementsLeft--;
        }
        return -1;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        problem1.findThreshold(28, new int[]{2,3,1,7,6,2,7,4});
    }
}
