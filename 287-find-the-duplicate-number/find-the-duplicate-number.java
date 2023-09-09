class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length , ans = -1 ;

        for(int i=0;i<n;i++)
        {
            int temp = nums[i];

            if(set.contains(temp))
            {
                ans = temp;
                break;
            }
            else
            {
                set.add(temp);
            }
            
        }
        return ans;
        
    }
}