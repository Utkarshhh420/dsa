class Solution {
public:
    int countPrimes(int n) {
        vector<bool>prime(n,true);
            for(int i=2;i<n;i++){
                if(prime[i]){
                    for(int j=i*2;j<n;j+=i){
                        prime[j]=false;
                    }
                }
            }
            int c=0;
            for(int i=2;i<n;i++){
                if(prime[i]==true){
                    c++;
                }
            }
            return c;
        }
    
};