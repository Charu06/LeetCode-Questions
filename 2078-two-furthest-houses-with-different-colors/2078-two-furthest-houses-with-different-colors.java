class Solution {
    public int maxDistance(int[] colors) {
        int s=0, e=colors.length-1, max=0;
        for(int i=0;i<colors.length;i++){
            if(colors[i]!=colors[s])
                max=Math.max(max, Math.abs(i-s));
            if(colors[i]!=colors[e])
                max=Math.max(max, Math.abs(i-e));
        }
        return max;
    }
}