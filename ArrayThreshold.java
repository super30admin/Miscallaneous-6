// Time Complexity : O(nlogn)
// Space Complexity: O(1)

// "static void main" must be defined in a public class.
public class Main {
    public static float findThresholdValue(int[] arr, int desiredSum) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        if(desiredSum > sum) return -1;
        
        float n = arr.length; 
        float threshold  = desiredSum / n;
        Arrays.sort(arr);
        
        for(int i=0; i< n;i++) {
            if(arr[i] < threshold) {
                threshold += (threshold - arr[i]) / (n - i -1);
            }
        }
        return threshold;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1 , 5};
        int desiredSum = 70;
        
        System.out.println(findThresholdValue(arr, desiredSum));
    }
}
