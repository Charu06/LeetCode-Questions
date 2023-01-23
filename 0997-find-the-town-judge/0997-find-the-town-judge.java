class Solution {
    public int findJudge(int n, int[][] trust) {
        int c[]=new int[n+1];
        for(int i=0;i<trust.length;i++){
            c[trust[i][0]]-=1;
            c[trust[i][1]]+=1;
        }
        for(int i=1;i<n+1;i++){
            if(c[i]==(n-1))
               return i;
        }
       return -1;
    }
}