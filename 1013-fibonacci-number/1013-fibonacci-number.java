class Solution {
    public int fib(int n) {
       
        int l=0,r=1,sum=0;
        if(n==0)return l;
        if(n==1)return r;

        for (int i = 2; i <= n; i++) {
           sum=l+r;
            l=r;
            r=sum;

        }
        return sum;
    }
}