class Solution {
    public String truncateSentence(String s, int k) {
           String[] words = s.split(" ");
        String[] result = new String[k];
        
        for(int i=0; i<k;i++){
            result[i] = words[i];
        }
        return String.join(" ", result);
        
    }
}