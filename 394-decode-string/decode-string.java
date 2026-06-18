class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==']'){
                String str1="";
                while(!st.empty() && Character.isLetter(st.peek())){
                    str1=st.pop()+str1;
                }
                while(!st.empty() && st.peek()=='[') st.pop();
                String str_n="";
                while(!st.empty() && Character.isDigit(st.peek())){
                    str_n=st.pop()+str_n;
                }
                int n=Integer.parseInt(str_n);
                String str2="";
                for(int i=0;i<n;i++){
                    str2+=str1;
                }
                for(char c:str2.toCharArray()){
                    st.push(c);
                }
            }
            else{
                st.push(ch);
            }
        }
        String res="";
        while(!st.empty()){
            res=st.pop()+res;
        }
        return res;
    }
}