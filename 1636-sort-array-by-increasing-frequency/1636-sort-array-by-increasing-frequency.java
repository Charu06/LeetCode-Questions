class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer, ArrayList<Integer>> map1=new HashMap<>();
        for(int x:map.keySet()){
            if(!map1.containsKey(map.get(x)))
                map1.put(map.get(x),new ArrayList<Integer>());
            map1.get(map.get(x)).add(x);
        }
        int a[]=new int[map1.size()];
        int ind=0;
        for(int x:map1.keySet())
            a[ind++]=x;
        Arrays.sort(a);
        for(int x:map1.keySet()){
            if(map1.get(x).size()>1)
                Collections.sort(map1.get(x), Collections.reverseOrder());
        }
        int[] res=new int[nums.length];
        int i=0;
        for(int x:a){
            List<Integer> list=map1.get(x);
            for(int y: list){
                int m=x;
                while(m>0){
                    res[i++]=y;
                    m--;
                }
            }
        }
        return res;
    }
}