class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        double totalwait=0;
        int currenttime=0;
        for(int vec:customers){
            int arrivaltime=vec[0];
            int cooktime=vec[1];
            if(currenttime<arrivaltime){
                currenttime =arrivaltime;
            }
            int waittime=currenttime+cooktime-arrivaltime;
            totalwait+=waittime;
            currenttime+=cooktime;
        }
        return totalwait/n;
    }
}