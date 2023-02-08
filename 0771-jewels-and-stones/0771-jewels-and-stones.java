class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            if(hs.containsKey(stones.charAt(i)))
                hs.put(stones.charAt(i),hs.get(stones.charAt(i))+1);
            else
                hs.put(stones.charAt(i),1);
        }
        for(int i=0;i<jewels.length();i++){
            if(hs.containsKey(jewels.charAt(i)))
                c+=hs.get(jewels.charAt(i));
        }
        return c;
    }
}