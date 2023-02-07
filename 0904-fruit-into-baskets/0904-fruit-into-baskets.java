class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> hs=new HashMap<>();
        int l=0;
        int total=0;
        int res=0;
        for(int i=0;i<fruits.length;i++){
            if(hs.containsKey(fruits[i])){
                hs.put(fruits[i],hs.get(fruits[i])+1);
            }
            else
                hs.put(fruits[i],1);
            
            while(hs.size()>2){
                hs.put(fruits[l],hs.get(fruits[l])-1);
                if(hs.get(fruits[l])==0)
                    hs.remove(fruits[l]);
                 l+=1;
            }
            res=Math.max(i-l+1,res);
        }
        return res;
    }
}