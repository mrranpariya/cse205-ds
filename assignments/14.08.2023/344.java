class Solution {
    public static void reverseString(char[] s) {
        reverseStringHelper(s, 0, s.length - 1);
    }
    
    private static void reverseStringHelper(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        reverseStringHelper(s, left + 1, right - 1);
    }
}