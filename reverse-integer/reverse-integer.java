class Solution {
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