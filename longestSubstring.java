class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        String nonDuplicate = "";
        String str = "";

        while (i < s.length()) {
            if (j < s.length()) {
                char elem = s.charAt(j);
                boolean exist = str.indexOf(elem) >= 0;

                if (!exist) {
                    str += elem; // Add the character to the substring
                    j++;
                } else {
                    // Update nonDuplicate if needed
                    if (nonDuplicate.length() < str.length()) {
                        nonDuplicate = str;
                    }
                    // Move to the next starting point
                    i++;
                    j = i; // Reset j to start searching from the new position
                    str = ""; // Reset str for the new substring
                }
            } else {
                // Handle case when j reaches the end of the string
                if (nonDuplicate.length() < str.length()) {
                    nonDuplicate = str; // Update nonDuplicate if str is longer
                }
                break; // Exit the loop
            }
        }

        return Math.max(nonDuplicate.length(), str.length());
    }
}
