class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int mini=m, maxi=0, minj=n, maxj=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    minj=Math.min(minj, j);
            }
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==1)
                    maxj=Math.max(maxj, j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[j][i]==1)
                    mini=Math.min(mini, j);
            }
            for(int j=m-1;j>=0;j--){
                if(grid[j][i]==1)
                    maxi=Math.max(maxi, j);
            }
        }
        return (maxi-mini+1)*(maxj-minj+1);
    }
}