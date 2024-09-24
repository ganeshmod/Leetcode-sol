class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxi=0;
        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
            int area=w*h;
            maxi=Math.max(maxi,area);
            //ab shrink krennge 
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxi;
    }
}