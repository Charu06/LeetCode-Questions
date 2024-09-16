class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=prerequisites.length;
        int ans[]=new int[numCourses];
        int k=0;
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }        
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int ind[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int x: adj.get(i)){
                ind[x]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0)
                q.offer(i);
        }
        while(!q.isEmpty()){
            int dep=q.poll();
            ans[k++]=dep;
            for(int x:adj.get(dep)){
                ind[x]--;
                if(ind[x]==0)
                    q.offer(x);
            }
        }
        if(k==numCourses)
            return ans;
        int[] arr={};
        return arr;
    }
}