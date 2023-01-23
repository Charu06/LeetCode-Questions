class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int ar[][]=new int[n-2][n-2];
         int a=3;
        for(int i=0;i<n-2;i++){
            int b=3;
            for(int j=0;j<n-2;j++){
                int max=0;
                
                for(int k=i;k<a;k++){
                    for(int l=j;l<b;l++){
                        max=Math.max(grid[k][l],max);
                }
            }
                ar[i][j]=max;
                b++;
        }
            a++;
    }
        return ar;
}
}