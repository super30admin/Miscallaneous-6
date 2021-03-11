//Time - O(row(A)*cols(A)*cols(B))
//Space - O(row(A)*cols(B))
class Solution {
  public:
    vector<vector<int>> sparseMatrixMultiplication(vector<vector<int>> A, vector<vector<int>> B){
        int Ar = A.size();
        int Ac = A[0].size();
        int Br = B.size();
        int Bc = B[0].size();
        
        vector<vector<int>> result (Ar,vector<int>(Bc,0));
        
        for(int i = 0;i<Ar;i++){
            for(int k = 0;k<Ac;k++){
                if(A[i][k] != 0){
                    for(int j = 0;j<Bc;j++){
                        if(B[k][j]!=0){
                            result[i][j] += A[i][k]*B[k][j];
                        }
                    }
                }
            }
        }
        return result;
    }
};

int main() {
    std::cout << "Hello World!\n";
    Solution sol;
    vector<vector<int>> A {{1,0,0},{-1,0,3}};
    vector<vector<int>> B {{7,0,0},{0,0,0},{0,0,1}};
    vector<vector<int>> ans;
    ans = sol.sparseMatrixMultiplication(A,B);
    for(auto r:ans){
        for(auto e:r){
            cout<<e<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}
