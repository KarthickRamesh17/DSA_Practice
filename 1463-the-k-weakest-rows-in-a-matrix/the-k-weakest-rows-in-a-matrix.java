class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
          int m = mat.length;
        
        // Create a HashMap to store row counts and indices
        HashMap<Integer, Integer> rowCounts = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            int count = countOnes(mat[i]);
            rowCounts.put(i, count);
        }
        
        // Create a list of Map entries for sorting
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(rowCounts.entrySet());
        
        // Sort the entries based on counts and row indices
        Collections.sort(entryList, (a, b) -> {
            int countCompare = a.getValue().compareTo(b.getValue());
            if (countCompare != 0) {
                return countCompare;
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });
        
        // Extract the row indices of the K weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }
        

        return result;
        
    }
    private static int countOnes(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }
}