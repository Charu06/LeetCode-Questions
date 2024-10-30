class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        int res[]=new int[numCourses];
        int indegree[]=new int[numCourses];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        int j=0;
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int x=q.peek();
            res[j++]=q.poll();
            for(int i:adj.get(x)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.offer(i);
                }
            }
        }
        if(j!=numCourses)
            return new int[]{};
        return res;
    }
}