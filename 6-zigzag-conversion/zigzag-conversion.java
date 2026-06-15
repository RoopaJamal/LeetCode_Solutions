class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows|| numRows==1) return s;
        int index=0;
        boolean down=false;
        StringBuilder[] arr=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]=new StringBuilder();
        }
        for(char ch:s.toCharArray()){
            arr[index].append(ch);
            if(index==0 || index==numRows-1) down=!down;
            index+=down?1:-1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb:arr){
            res.append(sb);
        }
        return res.toString();
    }
}