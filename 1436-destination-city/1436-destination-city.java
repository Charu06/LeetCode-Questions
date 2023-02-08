class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs=new HashSet<>();
        for(int j=0;j<paths.size();j++)
            hs.add(paths.get(j).get(0));
        for(int i=0;i<paths.size();i++){
            if(!hs.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }
        return "";
    }
}