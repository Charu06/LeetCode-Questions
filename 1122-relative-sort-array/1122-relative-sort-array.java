class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int res[]=new int[arr1.length];
        Map<Integer, Integer> map=new HashMap<>();
        Map<Integer, Integer> map2=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            map2.put(arr2[i], i);
        }
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        int ind=0;
        for(int i=0;i<arr2.length;i++){
            int x=arr2[i];
            while(map.get(x)>0){
                res[ind++]=x;
                map.put(x, map.get(x)-1);
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!map2.containsKey(arr1[i]))
                res[ind++]=arr1[i];
        }
        return res;
    }
}