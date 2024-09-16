class Pair{
    int distance;
    int node;
    public Pair(int distance, int node){
        this.distance=distance;
        this.node=node;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList());
        }
        for (int[] time : times) {
            int u = time[0], v = time[1], w = time[2];
            adj.get(u).add(new Pair(w, v));
        }
        int t=0;
        Set<Integer> set=new HashSet<>();
        pq.offer(new Pair(0,k));
        while(!pq.isEmpty()){
            int dist=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            if(set.contains(node))
                continue;
            set.add(node);
            t=Math.max(t, dist);
            for(Pair x:adj.get(node)){
                int node1=x.node;
                int dist1=x.distance;
                if(!set.contains(node1))
                    pq.offer(new Pair(dist+dist1, node1));
            }
        }
        return set.size()==n ? t : -1;
    }
}