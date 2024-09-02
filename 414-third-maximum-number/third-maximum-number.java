import java.util.TreeSet;
import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();

        for(int num: nums)
        {
            unique.add(num);
        }

        if(unique.size() < 3)
        {
            return unique.last();
        }
        else{
            return unique.lower(unique.lower(unique.last()));
        }
    

    }
}