class Solution {
    public int findPermutationDifference(String s, String t) {
        char arrs[]=s.toCharArray();
        char arrt[]=t.toCharArray();
        int count=0;
        for(int i=0;i<arrs.length;i++)
        { 
            
            for(int j=0;j<arrt.length;j++)
            {
                if(arrs[i]==arrt[j])
                    count= count+Math.abs(i-j);
                  
                      
                
                    
               }
          
        }
        return count;
        
    }
}