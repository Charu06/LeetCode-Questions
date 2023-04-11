class Solution {
    public String removeStars(String s) {
        List<Character> list=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='*')
                list.remove(list.size()-1);
            else
                list.add(s.charAt(i));
            i++;
        }
        StringBuffer sb=new StringBuffer("");
        for(int j=0;j<list.size();j++)
            sb.append(list.get(j));
        return sb.toString();
    }
}