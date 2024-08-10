class Solution {
    public int distMoney(int money, int children) {
        if(money<children){
            return -1;}
            if(money<children+7 ){
                return 0;}
                int ans=0;
                money-=children;
                while(money>0){
                    for(int i=0;i<children;i++){
                        if(money>=7){
                        money-=7;
                        ans++;}
                       else if(money==3 ){
                            ans--;
                            money+=1;
                        }
                        else{
                            money-=4;
                        }
                    }
                   
                }
                
             return ans;
        
        
    }
}