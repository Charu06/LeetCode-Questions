class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs=new HashSet<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.contains(ch)){
                c++;
                hs.clear();
                hs.add(ch);
            }
            else
                hs.add(ch);
        }
        return c+1;
    }
}