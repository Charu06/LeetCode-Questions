class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        int i=0;
        int k=0;
        while(k<pushed.length){
            pushed[i]=pushed[k];
            while(i!=-1 && pushed[i]==popped[j]){
                i--;
                j++;
            }
            i++;
            k++;
        }
        return i==0;
    }
}