class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int i = 0;
        while(num>0)
        {
            int last = num%10;
            arr[i] = last ;
            num = num/10;
            i++;
        }
        Arrays.sort(arr);
        String s1 = Integer.toString(arr[0]); 
        String s2 = Integer.toString(arr[3]); 
  
        // Concatenate both strings 
        String s = s1 + s2; 
  
        // Convert the concatenated string 
        // to integer 
        int ans1 = Integer.parseInt(s); 
        System.out.println(ans1);


        String s3 = Integer.toString(arr[1]); 
        String s4 = Integer.toString(arr[2]); 
  
        // Concatenate both strings 
        String str = s3 + s4; 
  
        // Convert the concatenated string 
        // to integer 
        int ans2 = Integer.parseInt(str); 
        System.out.println(ans2);
        
        return ans1+ans2;
    }
}