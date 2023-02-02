class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map=new HashMap<>();
        int x=1;
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),x++);
        }
        for(int i=0;i<words.length-1;i++){
            int c=0;
            int min=Math.min(words[i].length(),words[i+1].length());
            for(int j=0;j<min;j++){
                if(map.get(words[i].charAt(j))<map.get(words[i+1].charAt(j)))
                     break;       
                else if(map.get(words[i].charAt(j))>map.get(words[i+1].charAt(j)))
                    return false;
                else
                    c++;  
            }
            if(c==min&&words[i].length()>words[i+1].length())
                return false;
        }
        return true;
    }
}