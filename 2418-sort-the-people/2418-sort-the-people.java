import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,String> map=new HashMap<>();
          for(int i=0;i<n;i++){
              map.put(heights[i],names[i]);
          }
        //{180:"Mary",165:"John",170:"Emma"}
        //[180,170,165]
        Arrays.sort(heights);
       // System.out.println(Arrays.toString(heights));
       
        for(int i=n-1;i>=0;i--){
            names[n-i-1]=map.get(heights[i]);
        }
        return names;
    }
}