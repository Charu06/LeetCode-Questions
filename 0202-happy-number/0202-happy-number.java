class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet();
        while(!set.contains(n) && n!=1){
            set.add(n);
            n=squaresum(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    public int squaresum(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
}