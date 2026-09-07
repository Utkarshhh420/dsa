class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        

        unordered_map<int,int>fre;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
             if(j >= i)  swap(matrix[i][j],matrix[j][i]);
            //   fre[i+j]++;
            }
        }


        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //        cout<<matrix[i][j]<<" ";
        //     }
        //     cout<<endl;
        // }

        for(vector<int>&v : matrix){
            reverse(v.begin(),v.end());
        }
            
        


    }
};