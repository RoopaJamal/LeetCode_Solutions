class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int count=0;
        int[] a={0,0,0};
        for(int r=0;r<s.length();r++){
            a[s.charAt(r)-'a']++;
            while(a[0]>0 && a[1]>0 && a[2]>0){
                count+=s.length()-r;
                a[s.charAt(l)-'a']--;
                l++;
                // break;
            }
        }
        return count;

        // TLE
        // int right=0;
        // int count=0;
        // for(int left=0;left<s.length();left++){
        //     int a=0,b=0,c=0;
        //     right=left;
        //     while(right<s.length()){
        //         char ch=s.charAt(right);
        //         if(ch=='a') a++;
        //         else if(ch=='b') b++;
        //         else c++;
        //         if(a>0 && b>0 && c>0){
        //             count++;
        //             count+=s.length()-1-right;
        //             break;
        //         }
        //         right++;
        //     }
        // }
        // return count;
    }
}