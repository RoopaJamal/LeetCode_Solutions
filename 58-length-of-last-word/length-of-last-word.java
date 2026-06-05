class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int length=0;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)==' ' && length!=0) return length;
            else if(s.charAt(i)!=' ') length++;
        }
        return length;
    }
}