class Solution {
    public String restoreString(String s, int[] indices) {
        String s1="";
        int n=s.length();
        HashMap<Integer,Character> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(indices[i],s.charAt(i));
        }
        Arrays.sort(indices);
        for(int i=0;i<n;i++){
            s1+=map.get(i);
        }
        return s1;
    }
}