class Solution {
    public void rotate(int[][] matrix)
    {
          for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
  
        // Initialise start and end index
        int start = 0;
        int end = matrix.length - 1;
  
        // Till start < end, swap the element
        // at start and end index
        while (start < end) {
  
            // Swap the element
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
  
            // Increment start and decrement
            // end for next pair of swapping
            start++;
            end--;
        }
    }
  
       
        
    }
}