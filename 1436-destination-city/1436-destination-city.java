class Solution {
    public String destCity(List<List<String>> paths) {
        String key="";
        for(int j=0;j<paths.size();j++)
            key+=paths.get(j).get(0);
        for(int i=0;i<paths.size();i++){
            if(!key.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }
        return "";
    }
}