class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        int n=haystack.length(),k=needle.length();
        for(int i=0;i<=n-k;i++){
            if(haystack.charAt(i)==needle.charAt(0) && needle.equals(haystack.substring(i,i+k))) return i;
        }
        return -1;
    }
}