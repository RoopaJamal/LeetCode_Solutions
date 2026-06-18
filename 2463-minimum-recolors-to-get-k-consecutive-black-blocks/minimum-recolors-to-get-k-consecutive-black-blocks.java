class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0,r=0;
        int c=0,min=Integer.MAX_VALUE;
        while(r<blocks.length() && l<=r){
            if(blocks.charAt(r)=='W') c++;
            if((r-l+1)==k){
                min=Math.min(min,c);
                if(blocks.charAt(l)=='W'){
                    c--; 
                }
                l++;
            }
            r++;
        }
        return min;
    }
}