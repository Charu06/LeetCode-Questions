class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int sum=0;
        for(int i=0;i<m;i++)
            Arrays.sort(grid[i]);
        for(int i=n-1;i>=0;i--){
            int max=0;
            for(int j=0;j<m;j++){
                max=Math.max(max,grid[j][i]);
            }
            sum+=max;
        }
    return sum;
                
    }
}