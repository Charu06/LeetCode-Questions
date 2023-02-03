class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int a=0,b=mat.length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[a++][b--];
    }
        if(mat.length%2!=0)
            sum-=mat[(mat.length-1)/2][(mat.length-1)/2];
        return sum;
    }
}