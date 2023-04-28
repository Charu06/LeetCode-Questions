class Solution {
    public int minStartValue(int[] nums) {
        int i=1,sum=0;
        boolean f=true;
        while(f){
            sum+=i;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(sum<1){
                    f=false;
                    break;
                }
            }
            if(f==true){
                f=false;
                return i;
            }
            else{
                f=true;
                i++;
                sum=0;
            }
        }
        return 0;
    }
}