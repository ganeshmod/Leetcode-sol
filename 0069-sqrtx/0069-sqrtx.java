class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
   int l=1;
   int r=x/2;
   while(l<=r){
    int mid= (int) l+(r-l)/2;
    if(mid*mid==x){
        return mid;
    }
    else if( mid*mid <x){
        l=mid+1;
    }
    else{
        r=mid-1;
    }

   }
    return l-1;

    }
}