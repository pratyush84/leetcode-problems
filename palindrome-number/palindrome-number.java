class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } 
        
        int rev_num = reverse(x);
        
        return x-rev_num == 0;
        
    }
    
    public int reverse(int x) {
        int reverseNum=0;
        int prevRevNum = 0;
        int absNum = Math.abs(x);
        while(absNum > 0){
            int currDigit = absNum % 10;
            reverseNum = reverseNum*10 + currDigit;
            
            if((reverseNum - currDigit)/10  != prevRevNum){
                return 0;
            }
            
            prevRevNum = reverseNum;
            absNum /=10;
        }
        
        return x  > 0 ? reverseNum: -reverseNum;
    }
}