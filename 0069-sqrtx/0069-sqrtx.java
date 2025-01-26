class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
   long l=1;
   long r=x/2;
   while(l<=r){
  long  mid= (int) l+(r-l)/2;
    if( mid*mid==x){
        return  (int)mid;
    }
    else if( mid*mid <x){
        l=mid+1;
    }
    else{
        r=mid-1;
    }

   }
    return  (int)l-1;

    }
}