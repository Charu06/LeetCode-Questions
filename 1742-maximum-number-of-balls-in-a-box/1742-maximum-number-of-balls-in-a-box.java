class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int a[]=new int[46];
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int n=i;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            a[sum]++;
        }
        int max=0;
        for(int i=1;i<46;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }
}