class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        String check = "balloon";
        for(int i=0;i<check.length();i++){
            char c=check.charAt(i);
            if(c!='l'&&c!='o')
                min1=Math.min(min1,hm.getOrDefault(c,0));
            else
                min1=Math.min(min1,hm.getOrDefault(c,0)/2);
        }
        return min1;
    }
}