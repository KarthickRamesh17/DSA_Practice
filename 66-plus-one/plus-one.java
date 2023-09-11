class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;
        //If last digit is less than 9, increment and return
        if(digits[n-1] != 9){
           digits[n-1]++;
           return digits;
        }
		// Untill its 9, move forward and set digit[i]=0;
		int i=n-1;
        while(i>0 && digits[i]+1 == 10){
            digits[i]=0;
            i--;
        }
		// check if i==0 than create a new array of n+1 size else increment the digit[i]
        if(i==0 && digits[i]+1 == 10){
            int[] newDigits = new int[n+1];
            newDigits[0]=1;
            return newDigits;
        }else{
            digits[i]++;
        }
        return digits;
    }
}