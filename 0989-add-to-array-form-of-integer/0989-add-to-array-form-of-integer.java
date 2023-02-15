class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        while(i>=0||k>0){
            if(i>=0)
                k+=num[i--];
            int r=k%10;
            list.add(0,r);
            k/=10;
        }
        return list;
    }
}