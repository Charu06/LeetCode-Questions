class Solution {
    public String restoreString(String s, int[] indices) {
        String s1="";
        int n=s.length();
        /*HashMap<Integer,Character> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(indices[i],s.charAt(i));
        }
        for(int i=0;i<n;i++){
            s1+=map.get(i);
        }
        return s1;*/
        char c[]=new char[n];
        for(int i=0;i<n;i++){
           c[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<n;i++){
            s1+=c[i];
        }
        return s1;
    }
}