class Solution {
    public String intToRoman(int num) {

      int[]  number={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      StringBuilder sb=new StringBuilder();
      int ind=0;
      while(num>0){
        if(num>=number[ind]){
            sb.append(roman[ind]);
            num-=number[ind];
        }
        else{
            ind++;
        }
      }
      return sb.toString();
    }
}