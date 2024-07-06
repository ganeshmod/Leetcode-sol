class Solution {
    public String defangIPaddr(String address) {
        StringBuilder finalIp=new StringBuilder();
        int n= address.length();
        for(int  i=0;i<n;i++){
            if(address.charAt(i)=='.'){
               finalIp.append("[.]");
            }
            else {
                finalIp.append(address.charAt(i));
            }
        }
        return finalIp.toSting();
    }
}