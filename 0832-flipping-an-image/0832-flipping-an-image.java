class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            int x=n-1;
            for(int j=0;j<n;j++){
                a[i][j]=Math.abs(image[i][x--]-1);
            }
        }
        return a;
    }
}