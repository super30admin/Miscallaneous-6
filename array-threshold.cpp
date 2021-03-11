//Time - O(nlogn)
//Space - O(1)
class ArrayThreshold {
    public:
    float findArrayThreshold(vector<int> arr, int sum){
        float len = arr.size();
        float threshold = sum/len;
        sort(arr.begin(),arr.end());
        float remaining = 0;
        for(int i = 0;i<len;i++){
            if(threshold>arr[i]){
                remaining = threshold - arr[i];
                threshold = threshold + remaining/(len-i-1);
            }else{
                break;
            }
        }
        
        return threshold;
        
    }
};

int main() {
    std::cout << "Hello World!\n";
    ArrayThreshold t;
    vector<int> nums {2,1,3};
    cout<<t.findArrayThreshold(nums,6)<<endl;
    cout<<t.findArrayThreshold(nums,4)<<endl;
    vector<int> b {2,1,2,6,3,1};
    cout<<t.findArrayThreshold(b,10)<<endl;
}
