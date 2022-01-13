public class Main{
    public static float findThreshold(int [] nums, int target){
          float n = nums.length;
          Arrays.sort(nums);
          float threshold = target/n;
          
          for(int i = 0; i<n ;i++){
              if(nums[i] < threshold){
                  float diff = threshold - nums[i];
                  threshold = threhshold + diff/(n - (i+1));
              }
          }
      return threshold;
    }
  
  
  //TC: O(n)
  //SC: O(1)
        
        
    
