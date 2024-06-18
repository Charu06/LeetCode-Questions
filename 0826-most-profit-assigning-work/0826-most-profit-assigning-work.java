class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        int m=worker.length;
        TreeMap<Integer, Integer> map=new TreeMap<>();
        map.put(0,0);
        for(int i=0;i<n;i++){
            map.put(difficulty[i],Math.max(map.getOrDefault(difficulty[i],0),profit[i]));
        }
        int best=0,res=0;
        for(int key: map.keySet()){
            best=Math.max(best, map.get(key));
            map.put(key, best);
        }
        for(int i=0;i<m;i++){
            res+=map.floorEntry(worker[i]).getValue();
        }
        return res;
    }
}

//cpd