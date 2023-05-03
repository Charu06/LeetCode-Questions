class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        HashSet<Integer> hs1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
            hs1.add(nums1[i]);
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
            hs2.add(nums2[i]);
        List<Integer> a=new ArrayList<>();
        for(int i:hs1){
            if(!hs2.contains(i))
                a.add(i);
        }
        list.add(a);
        List<Integer> b=new ArrayList<>();
        for(int i:hs2){
            if(!hs1.contains(i))
                b.add(i);
        }
        list.add(b);
        return list;
    }
}