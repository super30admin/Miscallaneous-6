// "static void main" must be defined in a public class.
public class Main {

    //Time Complexity: 0(nlogn) where n is the no. of elements in nums array
    //Space Complexity: 0(1)

    public static float threshold(int [] nums, int target){
        float n = nums.length;  //to get the length of the array
        float thresh = target / n ; //getting the threshold Or the minimum number required at each index to meet the sum
        Arrays.sort(nums);  //Sorting the array as then I can calculate the left over amount as i progress
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < thresh){   //if current number is less than threshold value, then I re compute my threshold
                thresh = thresh + (thresh - nums[i]) / (n - i - 1); //the new threshold is old threshold plus the remaining value after subtracting the current number and the remaining value is divied by the no. of elements left in the array to distribute them equaly
            }
            else{
                break;  //if the threshold is less than current element means that my job is done as the elements after this will always be greater than the current or threshold
            }
        }
        return thresh;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 5};
        int target = 2;
        System.out.println(threshold(nums, target));
    }
}