class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int vis[]=new int[n];
        Arrays.fill(vis, -1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                vis[i]=0;
                if(dfs(i, vis, graph, 0)==false)
                    return false;
            }
        }
        return true;
    }
    public boolean dfs(int start, int vis[], int graph[][], int x){
        for(int i=0;i<graph[start].length;i++){
            if(vis[graph[start][i]]==x)
                return false;
            else if(vis[graph[start][i]]==1-x)
                continue;
            else{                
                vis[graph[start][i]]=1-x;
                if(dfs(graph[start][i], vis, graph, 1-x)==false)
                    return false;
            }
        }
        return true;
    }
}