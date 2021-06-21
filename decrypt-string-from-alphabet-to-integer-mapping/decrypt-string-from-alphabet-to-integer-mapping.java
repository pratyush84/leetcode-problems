class Solution {
    public String freqAlphabets(String s) {
      char[] chars = s.toCharArray();
        List<String> result = new ArrayList<>();

        for(int i=0; i < chars.length; i++){

            if(chars[i] == '#'){
                result.remove(result.size()-1);
                result.remove(result.size()-1);
                result.add(String.valueOf((char)(96 + Integer.parseInt(String.valueOf(chars[i-2]).concat(String.valueOf(chars[i-1]))))));
            } else {
                result.add(String.valueOf((char) (96 + Integer.parseInt(String.valueOf(chars[i])))));
            }
        }
        
        return String.join("", result);
    }
}