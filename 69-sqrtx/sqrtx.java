class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
    
        int answer = 0;
        
        while(low<=high){
            int mid = low +(high-low)/2;
            if(mid*mid==x){
                answer = mid;
                return answer;
            } 
            else if((long) mid*mid > x){
                high = mid - 1;
            }
            else
            {
                answer = mid;
                low = mid + 1;
            }
        }
        return answer;
  
    }
}