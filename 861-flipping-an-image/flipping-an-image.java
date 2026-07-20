class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int l=0,r=image.length-1;
            while(l<r){
                int t=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=t;
                l++;
                r--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}