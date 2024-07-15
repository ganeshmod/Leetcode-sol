class Solution {
    public String getSmallestString(String s) {
        int i=0;
        int j=1;
        char[] ch=s.toCharArray();
        while(j<ch.length){
            if(ch[i]%2==0 && ch[j]%2==0 && ch[i]>ch[j]){
                char temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                break;

            }
          else  if(ch[i]%2!=0 && ch[j]%2!=0 && ch[i]>ch[j]){
                char temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                break;

            }
           if (j == i + 1) {
                i++;
            }
            j++;
        }
        return new String(ch);
    }}