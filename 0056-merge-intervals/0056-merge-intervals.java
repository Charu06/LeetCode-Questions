class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(x->x[0]));
        List<int[]> l=new ArrayList<>();
        
        for(int i[]:intervals){
            if(!l.isEmpty() && l.get(l.size()-1)[1]>=i[0])
                l.get(l.size()-1)[1]=Math.max(l.get(l.size()-1)[1],i[1]);
            else
                l.add(i);
            }
        return l.toArray(new int[l.size()][]);
    }
}