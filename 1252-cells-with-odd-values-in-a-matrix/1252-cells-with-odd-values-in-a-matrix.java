class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][]=new int[m][n];
        int c=0;
        for(int i=0;i<indices.length;i++){
            int x=indices[i][0];
            int y=indices[i][1];
            for(int j=0;j<n;j++)
                a[x][j]+=1;
            for(int j=0;j<m;j++)
                a[j][y]+=1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2!=0)
                    c++;
            }
        }
        return c;
    }
}