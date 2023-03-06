class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr)
            hs.add(x);
        int a=1;
        while(k>0){
            if(!hs.contains(a))
                k--;
            a++;
        }
        return a-1;
    }
}