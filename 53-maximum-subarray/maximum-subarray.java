class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int sum = 0 ;

        for(int i =0 ;i<n;i++)
        {
            sum += nums[i];
            if(sum<0)
            {
                sum = 0;

            }
            if(sum>max)
            {
                max = sum;
            }
            
        }
        if(max==0)
        {
            max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                max= Math.max(max,nums[i]);
            }
        }
        return max;
        
    }
}