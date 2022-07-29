// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class Main {
    
    private static double calculateThreshold(int[] input, double desiredSum) {
        
        Arrays.sort(input);
        double capacity = desiredSum / input.length;
        int n = input.length;
        
        for(int i = 0; i < n; i++) {
            int num = input[i];
            
            if(num < capacity) {
                double additionalBurden = (capacity - num) / (n - i - 1);
                capacity += additionalBurden;
            }
        }
        
        return capacity;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double desiredSum = 3.0;
        int[] input = new int[] {2,1,5};
        System.out.println(calculateThreshold(input, desiredSum));
    }
}

// Source : https://www.youtube.com/watch?v=FoT7QrSZMHA&ab_channel=%7BS30%7D 