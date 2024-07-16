class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(majority == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                majority = nums[i];
                count++;
            }
            
        }
        return majority;
        
    }
}