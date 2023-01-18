class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int l=operations.length;
        int x=0;
        for(int i=0;i<l;i++){
            String s=operations[i];
            if(s.contains("--")){
                x-=1;
            }
            
            else if(s.contains("++")){
                x+=1;
            }
        }
        return x;
    }
}