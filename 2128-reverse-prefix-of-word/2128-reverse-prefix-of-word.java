class Solution {
    public String reversePrefix(String word, char ch) {
        
        int temp=word.indexOf(ch);
        if(temp==-1)
        return word;
        char chararray[]=word.toCharArray();
        int s=0;
        int l=temp;
        while(s<l){
        char character= chararray[l];
            chararray[l]  = chararray[s];
          chararray[s] = character;
          l--;
          s++;

        
        }
       return new String(chararray);
    }
}