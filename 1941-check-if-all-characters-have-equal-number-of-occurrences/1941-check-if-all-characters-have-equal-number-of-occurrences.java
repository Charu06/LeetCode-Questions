class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(a.containsKey(s.charAt(i)))
                a.put(s.charAt(i),a.get(s.charAt(i))+1);
            else
                a.put(s.charAt(i),1);
        }
        int n=a.get(s.charAt(0));
        for(int i : a.values()){
            if(i!=n)
                return false;
        }
        return true;
    }
}