class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange ){
            return numBottles;
        }
        int count=numBottles;
        int emptybottles=numBottles;
       while(emptybottles>=numExchange ){
        int newbottles=emptybottles/numExchange;
        count+=newbottles;
        emptybottles=emptybottles%numExchange + newbottles;
      
       }
       return count;
    }
}