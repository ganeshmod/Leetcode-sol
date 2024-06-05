class Solution {
    public List<String> commonChars(String[] words) {
        
        int[] minFreq = count(words[0]);

        for(int i = 1; i < words.length; i++){
            minFreq = intersection(minFreq, count(words[i]));
        }

        List<String> res = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            if(minFreq[i] != 0){
                char ch = (char)(i+'a');
                int count = minFreq[i];
                while(count > 0){
                    res.add(""+ ch);
                    count--;
                }
            }
        }
        return res;
    }
    public int[] intersection(int[] a, int[] b){
        int res[] = new int[26];
        for(int i = 0; i < 26; i++){
            res[i] = Math.min(a[i], b[i]);
        }
        return res;
    }

    public int[] count(String str){
        int[] res = new int[26];
        for(char c : str.toCharArray()){
            int idx = c - 'a';
            res[idx]++;
        }
        return res;
    }
}