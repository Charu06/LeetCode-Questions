class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        int m=worker.length;
        TreeMap<Integer, Integer> map=new TreeMap<>();
        map.put(0,0);
        for(int i=0;i<n;i++){
            map.put(difficulty[i],Math.max(map.getOrDefault(difficulty[i],0),profit[i])); // As there can be same difficulties for more than one tasks.
        }
        int best=0,res=0;
        for(int key: map.keySet()){
            best=Math.max(best, map.get(key)); // finding out the best value of profit till 'key' difficulty
            map.put(key, best);
        }
        for(int i=0;i<m;i++){
            res+=map.floorEntry(worker[i]).getValue(); //return a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key
        }
        return res;
    }
}

//cpd