// "static void main" must be defined in a public class.
//TC:O(NlogN) as we are sorting the array
//SC:O(1)
//Did it run successfully on Leetcode?:Yes
public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{2,1,5};
        System.out.println(findThreshold(test, 6));
        System.out.println(findThreshold(test, 2));
        System.out.println(findThreshold(test, 4));
        System.out.println(findThreshold(test, 1));
    }
    public static float findThreshold(int[] nums, int target){
        float n = nums.length;
        //initial threshold
        float threshold = target/n;
        //sort the array
        Arrays.sort(nums);
        //the numbers greater than current threshold will not change the threshold
        //keep updating the threshold if the number < current threshold
        
        //Calculate the new threshold
        for(int i = 0; i < n; i++){
             //Distribute the difference amont threshold of remaining numbers
             if (nums[i] < threshold) {
                threshold = threshold + (threshold - nums[i]) / (n - (i + 1));
            }
        }
        return threshold;
    }
}
