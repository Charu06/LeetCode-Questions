class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        while(i>=0){
            if(i>=0)
                k+=num[i--];
            list.add(0,k%10);
            k/=10;
        }
        while(k>0){
            list.add(0,k%10);
            k/=10;
        }
        return list;
    }
}