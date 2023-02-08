class Solution {
    public String destCity(List<List<String>> paths) {
        String city="";
        for(int i=0;i<paths.size();i++){
            boolean f=true;
            for(int j=0;j<paths.size();j++){
                if(paths.get(i).get(1).equals(paths.get(j).get(0)))
                    f=false;
            }
            if(f==true)
                city=paths.get(i).get(1);
        }
        return city;
    }
}