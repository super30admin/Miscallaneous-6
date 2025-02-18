public class Main {

    public static double findThreshold(double [] nums, double desiredSum){

        // logic

        // Sort the array.

        // the numbers greater than threshold will not change the threshhold

        // the smaller numbers will

        // Keep updating the threshold if the number < the current thresh hold;
        double n = nums.length;
        double threshHold = desiredSum / n ; // inital threshold
        Arrays.sort(nums); // sorting because we need to know the smaller persons inability to contribute with initial threshold itself. 
        // if not sort then threshold increases and they may not be able to contribute at all. 

        for(int i =0 ;i<n;i++){
            if(nums[i] < threshHold){
                double diff = threshHold - nums[i];
                // Calculate new threshhold
                // Distribute the diff among threshold of remaining numbers
                threshHold = threshHold + (diff / (n - i-1));
            }
        }

        return threshHold;

    }

    public static void main(String[] args) {

        double [] test = new double [] {2,1,5};

        System.out.println(findThreshold(test, 6));

        System.out.println(findThreshold(test, 2));

        System.out.println(findThreshold(test, 4));

        System.out.println(findThreshold(test, 1));

    }

    

}