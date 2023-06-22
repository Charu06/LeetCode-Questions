class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        csum(0, target, candidates, r ,d);
        return r;
    }
    public void csum(int i, int t, int a[], List<List<Integer>> r, List<Integer> d){
        if(i>=a.length){
            if(t==0){
                r.add(new ArrayList<Integer>(d));
            }
            return;
        }
        if(a[i]<=t){
            d.add(a[i]);
            csum(i, t-a[i], a, r, d);
            d.remove(d.size()-1);
        }
        csum(i+1, t, a, r, d);
    }
}