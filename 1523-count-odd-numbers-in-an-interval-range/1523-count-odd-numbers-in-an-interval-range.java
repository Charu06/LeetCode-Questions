class Solution {
    public int countOdds(int low, int high) {
        int c=high-low+1;
        if(low%2!=0&&high%2!=0)
            return (c/2)+1;
        else
            return c/2;
    }
}