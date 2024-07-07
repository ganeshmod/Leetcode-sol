class Solution {
    public int maxBottlesDrunk(int full, int ex) {
        int empty=full;
        int ans=full;
        full=0;
        while(empty>=ex || full>0)
        {
            while(empty>=ex)
            {
                empty-=ex;
                ex++;
                full++;
            }
            if(full>0)
            {
                ans+=full;
                empty+=full;
                full=0;
            }
        }
        return ans;
        
        
    }
}