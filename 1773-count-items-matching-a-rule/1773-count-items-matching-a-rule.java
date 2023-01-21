class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int a;
        if(ruleKey.equals("type"))
            a=0;
        else if(ruleKey.equals("color"))
            a=1;
        else
            a=2;
        for(int i=0;i<items.size();i++){
                if(items.get(i).get(a).equals(ruleValue)){
                    c++;
                }
            }
        return c;
    }
}