class Solution {
    public String countAndSay(int n) {
           if (n == 1) {
            return "1";
        }

        // Get the previous term in the sequence
        String previousTerm = countAndSay(n - 1);
        StringBuilder currentTerm = new StringBuilder();

        int count = 1;
        // Loop through the previous term to build the current term
        for (int i = 1; i < previousTerm.length(); i++) {
            if (previousTerm.charAt(i) == previousTerm.charAt(i - 1)) {
                count++;
            } else {
                currentTerm.append(count).append(previousTerm.charAt(i - 1));
                count = 1; // Reset count for the new character
            }
        }
        
        // Append the last counted character and its count
        currentTerm.append(count).append(previousTerm.charAt(previousTerm.length() - 1));
        
        return currentTerm.toString();
    }
}