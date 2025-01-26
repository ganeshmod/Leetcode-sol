class Solution {
    public int mySqrt(int x) {
        int l=0;
        int r=x;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(mid*mid==x){
            return  (int)mid;
        }
         else if(mid*mid<x){
            l=mid+1;
        }
        else {
                r=mid-1;

            }
            
        }
        return l-1;

    }
        
    }
